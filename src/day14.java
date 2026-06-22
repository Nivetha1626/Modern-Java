public class day14 {
        static class Student {
         String name;
          int age;
          int regNo;

          Student(Builder builder) {
              this.name = builder.name;
              this.age = builder.age;
              this.regNo = builder.regNo;
          }
          static class Builder {
              public String name;
              public int age;
              public int regNo;

              public Builder name(String nameValue) {
                  this.name = nameValue;
                  return this;
              }
              public Builder age(int ageValue) {
                  this.age = ageValue;
                  return this;
              }
              public Builder regNo(int regNoValue) {
                  this.regNo = regNoValue;
                  return this;
              }
              public Student build() {
                  return new Student(this);
              }
          }
      }

      static void main() {
          Student student = new Student.Builder()
                  .name("Nivetha")
                  .age(19)
                  .regNo(36)
                  .build();

          System.out.println(student.name);
          System.out.println(student.age);
          System.out.println(student.regNo);
  }
      }
