package anonimusinner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        MonitoringSystem generalIndicatorMonitorModule = new MonitoringSystem() {

            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг общих показателей стартовал");
            }
        };
        MonitoringSystem ErrorMonitoringModule = new MonitoringSystem() {

            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг отслеживания ошибок стартовал");
            }
        };
        MonitoringSystem SecurityModule = new MonitoringSystem() {

            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг общих показателей стартовал");

            }
        };


        generalIndicatorMonitorModule.startMonitoring();
        ErrorMonitoringModule.startMonitoring();
        SecurityModule.startMonitoring();

    }



    /*
    * new <ИМЕНИ_НЕТ> <класс родительский/реализуемый интерфейс>(параметры конструктора родителя){
    * };
    * */
}

/*
class GeneralIndicatorMonitoringModule implements MonitoringSystem{
    @Override
    public void startMonitoring() {
        System.out.println("Мониторинг общих показателей стартовал");

    }
}
*/

/*
class ErrorMonitoringModule implements MonitoringSystem{
    @Override
    public void startMonitoring() {
        System.out.println("Мониторинг отслеживания ошибок стартовал");

    }
}

class SecurityModule implements MonitoringSystem{
    @Override
    public void startMonitoring() {
        System.out.println("Мониторинг безопасности стартовал");

    }
}
*/
