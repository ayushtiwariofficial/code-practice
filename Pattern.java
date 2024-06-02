class Pattern{
    public static void main (String []args){

        //pattern 1
        int n = 6;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println();

        //pattern 2
        n=73;
        for(int i=65; i<=n; i++)
        {
            for(int j=65; j<=i; j++)
            {
                char ascii = (char)j;
                System.out.print(ascii+" ");
            }
            System.out.println();
        }

        System.out.println();

        //pattern 3
        n = 5;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if(i==1 || i==n)
                {
                    System.out.print("$ ");
                }
                else{
                    if(j==1 || j==n){
                        System.out.print("$ ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}