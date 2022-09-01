# ComputerParts



public class ComputerParts {
    MotherBoard MotherBoard;
    CPU CPU;
    RAM RAM;
    GraphicsAdapter GraphicsAdapter;
    StorageDevice StorageDevice;
    PowerSupplies PowerSupplies;
    Case Case;

    public void setMotherBoard(MotherBoard motherBoard) {
        this.MotherBoard = motherBoard;
    }

    public void setCPU(CPU CPU) {
        this.CPU = CPU;
    }

    public void setRAM(RAM RAM) {
        this.RAM = RAM;
    }

    public void setGraphicsAdapter(GraphicsAdapter graphicsAdapter) {
        this.GraphicsAdapter = graphicsAdapter;
    }

    public void setStorageDevice(StorageDevice storageDevice) {
        this.StorageDevice = storageDevice;
    }

    public void setPowerSupplies(PowerSupplies powerSupplies) {
        this.PowerSupplies = powerSupplies;
    }

    public void setCase(Case Case) {
        this.Case = Case;
    }

    ComputerParts() {
    }

    class MotherBoard {
        private String MotherBoard;

        MotherBoard(String motherBoard) {
            this.MotherBoard = motherBoard;
        }

        @Override
        public String toString() {
            return MotherBoard;
        }
    }

    class CPU {
        private String CPU;

        CPU(String CPU) {
            this.CPU = CPU;
        }

        @Override
        public String toString() {
            return CPU;
        }
    }

    class RAM {
        private String RAM;

        RAM(String RAM) {
            this.RAM = RAM;
        }

        @Override
        public String toString() {
            return RAM;
        }
    }

    class GraphicsAdapter {
        private String GraphicsAdapter;

        GraphicsAdapter(String GraphicsAdapter) {
            this.GraphicsAdapter = GraphicsAdapter;
        }

        @Override
        public String toString() {
            return GraphicsAdapter;
        }
    }

    class StorageDevice {
        private String StorageDevice;

        StorageDevice(String StorageDevice) {
            this.StorageDevice = StorageDevice;
        }

        @Override
        public String toString() {
            return StorageDevice;
        }
    }

    class PowerSupplies {
        private String PowerSupplies;

        PowerSupplies(String PowerSupplies) {
            this.PowerSupplies = PowerSupplies;
        }

        @Override
        public String toString() {
            return PowerSupplies;
        }
    }

    class Case {
        private String Case;

        Case(String Case) {
            this.Case = Case;
        }

        @Override
        public String toString() {
            return Case;
        }
    }

    @Override
    public String toString() {
        return "ComputerParts{" +
                "MotherBoard=" + MotherBoard +
                ", CPU=" + CPU +
                ", RAM=" + RAM +
                ", GraphicsAdapter=" + GraphicsAdapter +
                ", StorageDevice=" + StorageDevice +
                ", PowerSupplies=" + PowerSupplies +
                ", Case=" + Case +
                '}';
    }
}


class Test {
    public static void main(String[] args) {
        ComputerParts computerParts = new ComputerParts();

        ComputerParts.MotherBoard MotherBoard = computerParts.new MotherBoard("Gigabyte Z590 Aorus Xtreme");
        computerParts.setMotherBoard(MotherBoard);
        ComputerParts.CPU CPU = computerParts.new CPU("AMD Ryzen 9 5900X 3.7GHz/64MB");
        computerParts.setCPU(CPU);
        ComputerParts.RAM RAM = computerParts.new RAM("Kingston FURY DDR5-5600 16384MB PC5-44800");
        computerParts.setRAM(RAM);
        ComputerParts.GraphicsAdapter GraphicsAdapter = computerParts.new GraphicsAdapter("Gigabyte PCI-Ex GeForce RTX 3060 Ti ELITE 8G Aorus GDDR6");
        computerParts.setGraphicsAdapter(GraphicsAdapter);
        ComputerParts.StorageDevice StorageDevice = computerParts.new StorageDevice("SSD GOODRAM IRDM M.2 512 GB");
        computerParts.setStorageDevice(StorageDevice);
        ComputerParts.PowerSupplies PowerSupplies = computerParts.new PowerSupplies("Asus ROG Thor 1200W ");
        computerParts.setPowerSupplies(PowerSupplies);
        ComputerParts.Case Case1 = computerParts.new Case("GameMax StarLight W-FRGB White");
        computerParts.setCase(Case1);
        ComputerParts.Case Case2 = computerParts.new Case("Fractal Design Meshify 2 XL Light Tempered Glass");
        computerParts.setCase(Case2);
        System.out.println(computerParts);

    }
}
