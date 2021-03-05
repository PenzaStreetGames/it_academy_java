package penzastreet.com.task_3.part_2.fabric_method;

public class FabricMethod {
    public static void main(String[] args) {
        IProduct cola = new CocaColaCreator().createProduct();
        IProduct pepsi = new PepsiCreator().createProduct();
        cola.doStuff();
        pepsi.doStuff();
    }
}

interface ICreator {
    IProduct createProduct();
}

class CocaColaCreator implements ICreator {
    @Override
    public CocaCola createProduct() {
        return new CocaCola();
    }
}

class PepsiCreator implements ICreator {
    @Override
    public Pepsi createProduct() {
        return new Pepsi();
    }
}

class Pepsi implements IProduct {
    @Override
    public void doStuff() {
        System.out.println("This is Pepsi");
    }
}

class CocaCola implements IProduct {
    @Override
    public void doStuff() {
        System.out.println("This is CocaCola");
    }
}

interface IProduct {
    void doStuff();
}
