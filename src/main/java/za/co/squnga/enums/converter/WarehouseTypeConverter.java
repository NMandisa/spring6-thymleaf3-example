package za.co.squnga.enums.converter;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import za.co.squnga.enums.WarehouseType;


/**
 * @author Noxolo.Mkhungo
 */
@Converter
public class WarehouseTypeConverter implements AttributeConverter<WarehouseType,String> {
    @Override
    public String convertToDatabaseColumn(WarehouseType attribute) {
        if (attribute == null)
            return null;
        switch (attribute) {
            case DISTRIBUTION_CENTRE:
                return "DISTRIBUTION CENTRE";
            case CLIMATE_CONTROLLED:
                return "CLIMATE CONTROLLED";
            case  SMART:
                return "SMART";
            case  BONDED:
                return "BONDED";
            case  PRIVATE:
                return "PRIVATE";
            case  CONSOLIDATED:
                return "CONSOLIDATED";
            case  STORE:
                return "STORE";
            case  PUBLIC:
                return "PUBLIC";
            default:
                throw new IllegalArgumentException(attribute + " not supported.");
        }
    }

    @Override
    public WarehouseType convertToEntityAttribute(String dbData) {
        if (dbData == null)
            return null;
        switch (dbData) {
            case "DISTRIBUTION CENTRE":
                return WarehouseType.DISTRIBUTION_CENTRE;
            case "PUBLIC":
                return WarehouseType.PUBLIC;
            case "BONDED":
                return WarehouseType.BONDED;
            case "CONSOLIDATED":
                return WarehouseType.CONSOLIDATED;
            case "PRIVATE":
                return WarehouseType.PRIVATE;
            case "SMART":
                return WarehouseType.SMART;
            case "STORE":
                return WarehouseType.STORE;
            case "CLIMATE_CONTROLLED":
                return WarehouseType.CLIMATE_CONTROLLED;
            default:
                throw new IllegalArgumentException(dbData + " not supported.");
        }
    }
}
