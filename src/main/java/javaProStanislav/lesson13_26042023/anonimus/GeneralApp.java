package javaProStanislav.lesson13_26042023.anonimus;

public class GeneralApp {
    public static void main(String[] args) {
        GeneralIndicatorsMonitoringModule generalModule = new GeneralIndicatorsMonitoringModule(){
            public void startMonitoring(){
                System.out.println("Monitoring");
            }
            public void sayHello(){
                System.out.println("Hello");
            }
        };
        ErrorMonitoringModule errorMonitoringModule = new ErrorMonitoringModule();
        SecurityMonitoringModule securityMonitoringModule = new SecurityMonitoringModule();

        generalModule.startMonitoring();
        generalModule.sayHello();
        
    }
}
