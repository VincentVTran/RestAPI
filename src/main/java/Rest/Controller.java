package Rest;

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
        connection.testAdd();
        return "Hello";
    }
}
