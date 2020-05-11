import com.abstract_factory.AbstractDemo;
import com.abstract_factory.AbstractProgram;

public class Program {
    public static void main(String[] args) {
        AbstractProgram program = AbstractDemo.configureProgram();
        program.paint();
    }
}
