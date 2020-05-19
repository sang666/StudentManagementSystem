package Service;

import Dao.StudentDaoImpl;
import Entity.Student;

public class StudentService {
    StudentDaoImpl studentDao = new StudentDaoImpl();

    public void save(Student stu){
        if (studentDao.isExistByNo(stu.getSno())){
            System.out.println("此人已从在，不能重新增加");
        }
         else studentDao.save(stu);

    }

    public void update(Student stu,Integer sno){
        if (!studentDao.isExistByNo(sno)){
            System.out.println("查无此人");
        }
        studentDao.update(stu,sno);

    }

    public boolean isExistByNo(Integer sno){
        return studentDao.isExistByNo(sno);
    }


    public Student findByPK(Integer sno){
        return studentDao.findByPK(sno);

    }


}
