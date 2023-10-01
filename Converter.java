public class Converter {
    public static double convertLength(double length, int sourceUnit, int targetUnit) {
        switch (sourceUnit) {
            case 1: // Nanometers
                switch (targetUnit) {
                    case 1: // NanoMeters
                        return length;
                    case 2: // Microns
                        return length / 1000;
                    case 3: // Millimeters
                        return length / 1000000;
                    case 4: // Centimeters
                        return length * 0.0000001;
                    case 5: //Meters
                        return length * 0.000000001;
                    case 6: //Kilometers
                        return length / 1e+12;
                    case 7: //inch
                        return length / 2.54e+7;
                    case 8: //ft
                        return length / 3.048e+8;
                    case 9://yards
                        return length / 9.144e+8;
                    case 10: //miles
                        return length / 1.609e+12;
                    case 11: //nautical miles
                        return length / 1.852e+12;
                }
                break;

            case 2://microns
                switch (targetUnit) {
                    case 1: // NanoMeters
                        return length * 1000;
                    case 2: // Microns
                        return length;
                    case 3: // Millimeters
                        return length / 1000;
                    case 4: // Centimeters
                        return length / 10000;
                    case 5: //Meters
                        return length / 1e+6;
                    case 6: //Kilometers
                        return length / 1e+9
                                ;
                    case 7: //inch
                        return length / 25400;
                    case 8: //ft
                        return length / 304800;
                    case 9://yards
                        return length / 914400;
                    case 10: //miles
                        return length / 1.609e+9;
                    case 11: //nautical miles
                        return length / 1.852e+9;
                }
                break;
            case 3://Millimeters
                switch (targetUnit) {
                    case 1: // NanoMeters
                        return length * 1e+6;
                    case 2: // Microns
                        return length * 1000;
                    case 3: // Millimeters
                        return length;
                    case 4: // Centimeters
                        return length / 10;
                    case 5: //Meters
                        return length / 1000;
                    case 6: //Kilometers
                        return length / 1e+6
                                ;
                    case 7: //inch
                        return length / 25.4;
                    case 8: //ft
                        return length / 304.8;
                    case 9://yards
                        return length / 914.4;
                    case 10: //miles
                        return length / 1.609e+6;
                    case 11: //nautical miles
                        return length / 1.852e+6;
                } break;
            case 4://CM
                switch (targetUnit) {
                    case 1: // NanoMeters
                        return length * 1e+7;
                    case 2: // Microns
                        return length * 10000;
                    case 3: // Millimeters
                        return length * 10;
                    case 4: // Centimeters
                        return length;
                    case 5: //Meters
                        return length / 100;
                    case 6: //Kilometers
                        return length / 100000;
                    case 7: //inch
                        return length / 2.54;
                    case 8: //ft
                        return length / 30.48;
                    case 9://yards
                        return length / 91.44;
                    case 10: //miles
                        return length / 160900;
                    case 11: //nautical miles
                        return length / 185200;
                } break;
            case 5://meters
                switch (targetUnit) {
                    case 1: // NanoMeters
                        return length * 1e+9;
                    case 2: // Microns
                        return length * 1e+6;
                    case 3: // Millimeters
                        return length * 1000;
                    case 4: // Centimeters
                        return length * 100;
                    case 5: //Meters
                        return length;
                    case 6: //Kilometers
                        return length / 1000;
                    case 7: //inch
                        return length * 39.37;
                    case 8: //ft
                        return length * 3.281;
                    case 9://yards
                        return length * 1.094;
                    case 10: //miles
                        return length / 1609;
                    case 11: //nautical miles
                        return length / 1852;
                } break;
            case 6://KM
                switch (targetUnit) {
                    case 1: // NanoMeters
                        return length * 1e+12;
                    case 2: // Microns
                        return length * 1e+9;
                    case 3: // Millimeters
                        return length * 1e+6;
                    case 4: // Centimeters
                        return length * 100000;
                    case 5: //Meters
                        return length * 1000;
                    case 6: //Kilometers
                        return length;
                    case 7: //inch
                        return length * 39370;
                    case 8: //ft
                        return length * 3281;
                    case 9://yards
                        return length * 1094;
                    case 10: //miles
                        return length / 1.609;
                    case 11: //nautical miles
                        return length / 1.852;
                } break;
            case 7://inch
                switch (targetUnit) {
                    case 1: // NanoMeters
                        return length * 2.54e+7;
                    case 2: // Microns
                        return length * 25400;
                    case 3: // Millimeters
                        return length * 25.4;
                    case 4: // Centimeters
                        return length * 2.54;
                    case 5: //Meters
                        return length / 39.37;
                    case 6: //Kilometers
                        return length / 39370;
                    case 7: //inch
                        return length;
                    case 8: //ft
                        return length / 12;
                    case 9://yards
                        return length / 36;
                    case 10: //miles
                        return length / 63360;
                    case 11: //nautical miles
                        return length / 72910;
                } break;
            case 8://Ft
                switch (targetUnit) {
                    case 1: // NanoMeters
                        return length * 3.048e+8;
                    case 2: // Microns
                        return length * 304800;
                    case 3: // Millimeters
                        return length * 304.8;
                    case 4: // Centimeters
                        return length * 30.48;
                    case 5: //Meters
                        return length / 3.281;
                    case 6: //Kilometers
                        return length / 3281;
                    case 7: //inch
                        return length * 12;
                    case 8: //ft
                        return length;
                    case 9://yards
                        return length / 3;
                    case 10: //miles
                        return length / 5280;
                    case 11: //nautical miles
                        return length / 6076;
                }break;
            case 9://Yards
                switch (targetUnit) {
                    case 1: // NanoMeters
                        return length * 9.144e+8;
                    case 2: // Microns
                        return length * 914400;
                    case 3: // Millimeters
                        return length * 914.4;
                    case 4: // Centimeters
                        return length * 91.44;
                    case 5: //Meters
                        return length / 1.094;
                    case 6: //Kilometers
                        return length / 1094;
                    case 7: //inch
                        return length * 36;
                    case 8: //ft
                        return length * 3;
                    case 9://yards
                        return length;
                    case 10: //miles
                        return length / 1760;
                    case 11: //nautical miles
                        return length / 2025;
                } break;
            case 10://miles
                switch (targetUnit) {
                    case 1: // NanoMeters
                        return length * 1.609e+12;
                    case 2: // Microns
                        return length * 1.609e+9;
                    case 3: // Millimeters
                        return length * 1.609e+6;
                    case 4: // Centimeters
                        return length * 160900;
                    case 5: //Meters
                        return length * 1609;
                    case 6: //Kilometers
                        return length * 1.609;
                    case 7: //inch
                        return length * 63360;
                    case 8: //ft
                        return length * 5280;
                    case 9://yards
                        return length * 1760;
                    case 10: //miles
                        return length;
                    case 11: //nautical miles
                        return length / 1.151;
                } break;
            case 11://Nautical miles
                switch (targetUnit) {
                    case 1: // NanoMeters
                        return length * 1.852e+12;
                    case 2: // Microns
                        return length * 1.852e+9;
                    case 3: // Millimeters
                        return length * 1.852e+6;
                    case 4: // Centimeters
                        return length * 185200;
                    case 5: //Meters
                        return length * 1852;
                    case 6: //Kilometers
                        return length * 1.852;
                    case 7: //inch
                        return length * 72910;
                    case 8: //ft
                        return length * 6076;
                    case 9://yards
                        return length * 2025;
                    case 10: //miles
                        return length * 1.151;
                    case 11: //nautical miles
                        return length;


                }
                return 0.0; // Default if units are not recognized
        }
        return length;
    }}





