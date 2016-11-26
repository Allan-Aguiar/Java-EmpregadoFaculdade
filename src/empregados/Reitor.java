package empregados;

public class Reitor extends EmpregadosFeculdade{
    
    @Override
    String getInfo(){
        return super.getInfo() + " Ele é o reitor";
    }
}
