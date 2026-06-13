public class  day8 {
    record  CourseRecord(String courseName,String department){
    }
    static void main(){
        CourseRecord courseRecord =new CourseRecord(  "Modern java","Computer science" );
        System.out.println(courseRecord.courseName());
        System.out.println(courseRecord.department());

    }

}
