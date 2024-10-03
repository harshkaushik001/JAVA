class App{
    int [] arr=new int[5];
    App(){}
    App(App a){


    }
}
class mainC{
    public static void main(String args[]){
        App a1=new App();
        a1.arr[0]=100;
        App a2=new App(a1);
        //a2.arr[0];
        System.out.println(a2.arr[0]);
    }
}