package UI.Data;
import Tools.Engine;

public class ORM {
    private String _message;
    public ORM(String msg) {
        this._message = msg;
    }
    public void connect(int code) {
        Engine e = new Engine();
        if (code == 0) {            
            e.test(this._message);
        }
        else if (code == 1) {            
            e.test("Correct Code");
        }
        else {
            e.test("Invalid Code");
        }
    }
}

