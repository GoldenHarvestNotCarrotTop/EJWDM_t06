package by.epamtc.dao;

import by.epamtc.exception.DaoException;
import by.epamtc.exception.NullDaoException;

import java.io.IOException;
import java.util.List;

public interface Dao<T> {
    List<T> getAll() throws IOException, DaoException;

    void insert(T t) throws IOException, NullDaoException, DaoException;

    void insertAll(List<T> items) throws IOException, NullDaoException, DaoException;

    void deleteAll(List<T> items) throws IOException, NullDaoException, DaoException;

    void delete(T t) throws IOException, NullDaoException, DaoException;

    void clear() throws IOException, NullDaoException;
}
