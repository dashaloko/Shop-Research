package app;

public class Main {

    public static void main(String[] args) {

        DataProvider provider = new DataProvider();
        DataHandler dataHandler = new DataHandler();


        String namesOutput = dataHandler.dataHandler(provider.getProductNames());
        getOutput("Products: " + namesOutput);


        String salesOutput = dataHandler.dataHandler(provider.getSalesAmounts());
        getOutput("Sales, EUR: " + salesOutput);
    }


    private static void getOutput(String output) {
        System.out.println(output);
    }
}
