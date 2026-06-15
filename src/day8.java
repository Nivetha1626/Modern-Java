public class  day8 {
    /*
    program 1
    record  CourseRecord(String courseName,String department){
    }
    static void main(){
        CourseRecord courseRecord =new CourseRecord(  "Modern java","Computer science" );
        System.out.println(courseRecord.courseName());
        System.out.println(courseRecord.department());

    }

     */

   /* enum LANGUAGES {
        TA("Tamil"),
        EN("English"),
        GR("German"),
        JP("Janpanese");
String description;
 LANGUAGES(String description){
     this.description=description;
 }
    }
    static void main(){
        System.out.println(LANGUAGES.TA.description);
        System.out.println(LANGUAGES.EN.description);
        System.out.println(LANGUAGES.JP.description);
        System.out.println(LANGUAGES.GR.description);
    }
}

    */


        sealed interface LoginResult permits LoginSuccess, LoginFailure, LoginLoading {

        }

        record LoginSuccess(String time) implements LoginResult {

        }

        record LoginFailure(String reason) implements LoginResult {

        }

        record LoginLoading(String expectedTime) implements LoginResult {

        }

        record Rendom(String reason) {

        }

        static void handleLogin(LoginResult result) {
            switch (result) {
                case LoginSuccess success -> System.out.println("Login Success at :" + success.time());
                case LoginFailure failure -> System.out.println("Login Failure becasuse of " + failure.reason());
                case LoginLoading loading -> System.out.println("Login Loadind, " + loading.expectedTime());
            }
        }

        static void main() {
            LoginResult loginSuccess = new LoginSuccess("2026-06-14:10pm");
            LoginFailure loginFailure = new LoginFailure("Invailed User name or Password");
            LoginLoading loginLoading = new LoginLoading("just 2 mins");

            handleLogin(loginSuccess);
            handleLogin(loginFailure);
            handleLogin(loginLoading);
        }
    }

