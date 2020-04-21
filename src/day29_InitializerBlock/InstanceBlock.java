package day29_InitializerBlock;
/*


				instance block: execution depends on the creation of object, runs before the constructor

				constructor: execution depends on the creation of object. runs after the instance block

 */
public class InstanceBlock {
    public InstanceBlock(){
        System.out.println("This is Constructor");
    }

    {
        System.out.println("Instance Block");
    }
    {
        System.out.println("Instance Block2");
    }

    public static void main(String[] args) {
        InstanceBlock obj = new InstanceBlock();

    }
}
