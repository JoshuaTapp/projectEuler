public class EP2 {

    public static void main(String args[]){
        Fib P2 = new Fib();
        P2.total();
        System.out.println(P2.getSum());

    }

    static class Fib {

        public Fib() {
        }

        private int i = 1;
        private int j = 1;
        private int count = 3;
        private int sum = 0;
        private int target = 4000000;

            //GETTERS AND SETTERS

            public int getI() {
                return i;
            }

            public void setI(int i) {
                this.i = i;
            }

            public int getJ() {
                return j;
            }

            public void setJ(int j) {
                this.j = j;
            }

            public int getCount() {
                return count;
            }

            public void setCount(int count) {
                this.count = count;
            }

            public int getSum() {
                return sum;
            }

            public void setSum(int sum) {
                this.sum = sum;
            }

            public int getTarget() {
            return target;
        }

            public void setTarget(int target) {
            this.target = target;
        }


        public void add() {
            int k = getI() + getJ();

                if (getCount()%3 == 0){
                setSum(getSum() + k);
                System.out.println(getSum());
                }

        System.out.println(getI() + " " + getJ() + " = " + k);

            setI(getJ());
            setJ(k);
            setCount(getCount() + 1);
        }
        public void total(){
                do{
                    add();
                }while(getJ() <= getTarget());

        }
    }



}

