package Rest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Invocation {

    public static void main(String[] args){
        /*try{
            Runtime runtime = Runtime.getRuntime();
            runtime.exec("cd ./Webpage");
            runtime.exec("ng serve --open");

        }
        catch(Exception e){
            System.out.println("Angular did not work.");
        }
        */
        SpringApplication.run(Invocation.class,args);
    }
}
