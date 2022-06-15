package exceptions.data;

public class Bunny extends Hoper{

    public static void main(String ...args) {

        Bunny bunny = new Bunny();
    }

    private static void eatCarrot() throws NoMoreCarrotsException {

    }

    public void catchTheError() {}

    public void furtherThrowTheError() throws NoMoreCarrotsException {}

    @Override
    public void hop() throws CannotHopException {

    }
}
