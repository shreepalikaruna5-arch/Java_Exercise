//6. Write a program to demonstrate the `delete()` method.
class Delete{
    public static void main(String[] args){
        StringBuffer name = new StringBuffer("Karuna Shreepali");
        name.delete(6,16);
        System.out.print(name);
    }
}