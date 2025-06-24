public class VehicleStorageAdapter implements IVehicleStorage{
    private OldVehicleStorage oldVehicleStorage;

    public VehicleStorageAdapter() {
        this.oldVehicleStorage = new OldVehicleStorage();;
    }

    @Override
    public void saveVehicleData(Vehicle vehicle) {
        String dataString = "ID: " + vehicle.getId() +" | Modelo: " + vehicle.getModel() +" | Ano: " + vehicle.getYear();

        oldVehicleStorage.storeVehicleData(dataString);
    }
}