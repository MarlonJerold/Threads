public class MinhaThread extends Thread {

    private String mensagem;

    public MinhaThread(String mensagem){
        this.mensagem = mensagem;
    }

    public void run() {
        for(int i=0; i<5; i++){
            System.out.println(mensagem);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }

    }

}
