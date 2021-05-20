package by.epamtc.dao;

import by.epamtc.exception.DaoException;
import by.epamtc.exception.NullDaoException;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class SerializableDao<T>  implements Dao<T> {
    private final String filename;

    public SerializableDao(String filename) {
        this.filename = filename;
    }

    @Override
    public List<T> getAll() throws IOException, DaoException {
        ObjectInputStream ois = openInStream();
        List<T> data = null;
        try {
            data = (List<T>) ois.readObject();
        } catch (ClassNotFoundException e) {
            throw new DaoException("Cannot cast object from input file to generic parameter");
        }
        ois.close();
        return data;
    }

    private void saveAll(List<T> data) throws IOException {
        ObjectOutputStream oos = openOutStream();
        oos.writeObject(data);
        oos.close();
    }


    private ObjectInputStream openInStream() throws IOException {
        var path = Paths.get(filename);
        if (!Files.exists(path)) {
            Files.createFile(path);
        }
        FileInputStream in = new FileInputStream(filename);
        return new ObjectInputStream(in);
    }

    private ObjectOutputStream openOutStream() throws IOException {
        FileOutputStream f = new FileOutputStream(filename);
        return new ObjectOutputStream(f);
    }


    @Override
    public void insert(T t) throws IOException, NullDaoException, DaoException {
        if(t == null)
            throw new NullDaoException("Item must not be null");
        List<T> data = getAll();
        data.add(t);
        saveAll(data);
    }

    @Override
    public void insertAll(List<T> items) throws IOException, NullDaoException, DaoException {
        if(items == null)
            throw new NullDaoException("Items must not be null");
        List<T> data = getAll();
        data.addAll(items);
        saveAll(data);
    }

    @Override
    public void deleteAll(List<T> items) throws IOException, NullDaoException, DaoException {
        if(items == null)
            throw new NullDaoException("Items must not be null");
        List<T> data = getAll();
        data.removeAll(items);
        saveAll(data);
    }

    @Override
    public void delete(T t) throws IOException, NullDaoException, DaoException {
        if(t == null)
            throw new NullDaoException("Item must not be null");
        List<T> data = getAll();
        data.remove(t);
        saveAll(data);
    }

    @Override
    public void clear() throws IOException, NullDaoException {
        saveAll(new ArrayList<T>());
    }
}
