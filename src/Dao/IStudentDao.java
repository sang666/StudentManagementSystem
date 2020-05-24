package Dao;

import Entity.MixPojo;
import Entity.Student;

import java.util.List;

public interface IStudentDao {
    void save(Student stu);

    Student findByPK(Integer sno);

    void update(Student stu, Integer sno);

    boolean isExistByNo(Integer sno);

    List<Student> findStudent();

    void delete(Integer sno);

    List<Student> findStudent(String sname);

    int getTitalCount();

    MixPojo MixFindByPk(Integer sno);
}
