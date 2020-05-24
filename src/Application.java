import Dao.ManagerImpl;
import Dao.StudentDaoImpl;
import Entity.MixPojo;
import Entity.Student;

import java.util.Scanner;

public class Application {
    static Scanner input = new Scanner(System.in);
    static Student stu = null;
    static StudentDaoImpl studentDao = new StudentDaoImpl();

    public static void main(String[] args) {
        ManagerImpl manager = new ManagerImpl();
        Scanner input = new Scanner(System.in);

        System.out.println("---------欢迎进入管理系统--------");
        System.out.println("---------请输入管理员账号--------");
        //Scanner input = new Scanner(System.in);
        String mno = input.next();

        //System.out.println(manager.findPassword("sang666"));
        //String psd = "sang666";
        //System.out.println(manager.findPassword(psd).getMpassword());

        System.out.println("请输入管理员密码");

        String psd = input.next();
        //manager.findPassword(mno);
        if (!psd.equals(manager.findPassword(mno).getMpassword())){
            System.out.println("用户名不从在");

        } System.out.println("欢迎回来"+manager.findPassword(mno).getMname());
        start();



    }

    public static void showMenu() {
        System.out.println("+-----------------------------------------+");
        System.out.println("|          1.添加学生信息                 |");
        System.out.println("|          2.修改学生信息                 |");
        System.out.println("|          3.删除学生信息                 |");
        System.out.println("|          4.查找学生信息                 |");
        System.out.println("|          5.查看所有学生                 |");
        System.out.println("|          6.模糊查询                    |");
        System.out.println("|          7.退出                       |");
        System.out.println("+-----------------------------------------+");
    }

    public static void start() {
        do {
            showMenu();
            System.out.print("请选择操作：(1)添加学生信息  (2)修改 (3)删除 (4)查找  (5)查看所有学生  (6)模糊查询 7(联合查询) (8)退出  ");
            int choose = input.nextInt();
            switch (choose){
                case 1: //add
                    //StudentDaoImpl studentDao = new StudentDaoImpl();
                    //Student stu = null;

                    System.out.println("学号是");
                    Integer no = input.nextInt();
                    System.out.println("名字是");
                    String name = input.next();
                    System.out.println("性别是");
                    String sex = input.next();
                    System.out.println("学院是");
                    String acad = input.next();
                    System.out.println("班机是");
                    Integer grade = input.nextInt();
                    System.out.println("电话号码是");
                    Integer phone = input.nextInt();
                    stu = new Student(no,name,sex,acad,grade,phone);
                    studentDao.save(stu);
                    System.out.println("您的信息已添加成功,信息如下"+studentDao.findByPK(no));
                    break;
                case 2: //update
                    System.out.print("请输入更新学生的学号：");
                    Integer updateNo = input.nextInt();
                    System.out.println("学号是");
                    Integer updateno = input.nextInt();
                    System.out.println("名字是");
                    String updatename = input.next();
                    System.out.println("性别是");
                    String updatesex = input.next();
                    System.out.println("学院是");
                    String updateacad = input.next();
                    System.out.println("班机是");
                    Integer updategrade = input.nextInt();
                    System.out.println("电话号码是");
                    Integer updatephone = input.nextInt();
                    stu = new Student(updateno,updatename,updatesex,updateacad,updategrade,updatephone);
                    studentDao.update(stu,updateNo);
                    System.out.println("您的信息已更新完成，更新完后的信息如下"+studentDao.findByPK(updateNo));


                    break;
                case 3: //delete
                    System.out.print("请输入学生删除的学号：");
                    Integer deleteNo = input.nextInt();
                    studentDao.delete(deleteNo);


                    break;
                case 4: //find
                    System.out.print("请输入查询的学生学号：");
                    Integer findNo = input.nextInt();
                    System.out.println("学生信息如下"+studentDao.findByPK(findNo));

                    break;
                case 5: //list
                    for(Student student:studentDao.findStudent()){
                        System.out.println(student);
                    }
                    break;
                case 6://模糊查询
                    System.out.println("输入要模糊查询的内容");
                    String sname = input.next();
                    for(Student student:studentDao.findStudent("%"+sname+"%")){
                        System.out.println(student);
                    }
                    break;
                case 7://模糊查询
                    System.out.println("输入要联合查询的学生学号");
                    Integer sno = input.nextInt();
                    for(MixPojo mixPojo:studentDao.MixFindByPk(sno)){
                        System.out.println(mixPojo);
                    }

                    break;
                default:
                    //Application shutdown
                    System.exit(0);
            }

            //是否继续
            System.out.println("是否继续(Y/N)?");
            String cont = input.next();
            if (!"Y".equalsIgnoreCase(cont)) {
                break;
            }
        } while (true);
    }



}
