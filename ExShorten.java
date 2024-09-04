public class ExShorten {
            public static void main(String[] args) {
                //Shortens the Array Command
                String [] arrString = {"Sio ", "Girsang"};

                int [] arrInt = new int[] {5, 10, 12, 15};

                long [] arrLong = {5L, 10L, 12, 15L};

                //for String
                System.out.println("String Output:");
                arrString[1] = null;
                System.out.print(arrString[0] + "");
                System.out.println(arrString[1]);
                System.out.println(arrString.length);

                //for Integer
                System.out.println("Integer Output:");
                arrInt[1] = 0;
                System.out.print(arrInt[0] + ", ");
                System.out.print(arrInt[1] + ", ");
                System.out.print(arrInt[2] + ", ");
                System.out.println(arrInt[3]);
                System.out.println(arrInt.length);

                //for long
                System.out.println("Long Output:");
                arrLong[2] = 0;
                System.out.print(arrLong [0]+", ");
                System.out.print(arrLong [1]+", ");
                System.out.print(arrLong [2]+", ");
                System.out.println(arrLong [3]);
                System.out.println(arrLong.length);
            }
        }
