public class ServiceStation {

    public void check(Vehicle vehicle) {
        vehicle.checkService();
        System.out.printf("Обслуживается %s%n" , vehicle.getModelName());
    }
}
