import pkg.display;
 class packages 
    {
        public static void main(String[] args) 
        {
            display[] arr=new display[3];
            for(int i=0;i<3;i++)
                arr[i]=new display();
            arr[0].x = 0;      
            arr[1].x = 1;
            arr[2].x = 2;
            for (int i = 0; i < 3; ++i)
                arr[i].show();
         }
    }
