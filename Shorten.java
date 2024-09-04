 public class Shorten {
        public static void main(String[] args) {
            int[] arrInt = new int[]{5, 10, 12, 15};

            String[] arrString = {"Sio ", "Girsang"};

            long [] arrLong = {5L, 10L, 12, 15L};

            //Changing Array Values
            System.out.println("Integer Output:");
            System.out.print(arrInt[0] + ", ");
            System.out.print(arrInt[1] + ", ");
            System.out.print(arrInt[2] + ", ");
            System.out.println(arrInt[3]);

            //for String
            System.out.println("String Output:");
            System.out.print(arrString[0] + "");
            System.out.println(arrString[1]);

            //for Long
            System.out.println("Long Output:");
            System.out.print(arrLong [0]+", ");
            System.out.print(arrLong [1]+", ");
            System.out.print(arrLong [2]+", ");
            System.out.println(arrLong [3]);

            /*Changing Array Values
            ex:
            arrInt [1] = 0;
            arrLong [1] = 0;
            for String
            ex:
            arrString [1] = null;

            find the length of the array
            ex:
            System.out.println(arrString.length);

            do it in the output
             */
        }
}
