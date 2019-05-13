package Rest;
import Test.Idk;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import Rest.SQLDriver;

import java.sql.SQLException;


@RestController
public class Controller {
     /*@RequestMapping("/localsave")
    public DataObject Local_Save(){
        return null;
    }
    @RequestMapping("/sqlsave")
    public void Save_Data(@RequestParam(value = "name", defaultValue = "Null")String name,@RequestParam(value = "ID", defaultValue = "0")int ID){
    }
*/
    @RequestMapping("/test")
    public String test() throws SQLException {
        SQLDriver connection = new SQLDriver();
        connection.setUp();
        connection.grabData();
        return "Hello";
    }

    @RequestMapping("/returnArray") //Request link extension
    @CrossOrigin(origins="http://localhost:4200") //Allows access across ports
    public String[] testArray(){
        System.out.println("Worked");
        String[] test = new String[]{"Hello","Test","Four"}; //Returns array on access
        return test;
    }
}
