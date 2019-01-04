package classDefinitions;
import java.util.ArrayList;
public class HardDriveDef {

		String name;
		ArrayList<Double> fileSize = new ArrayList<Double>();
		double totalCapacity;
		double freeSpace;
		
		public HardDriveDef(double xCapacity, double xfreeSpace, String xName){
			totalCapacity = xCapacity;
			freeSpace = xfreeSpace;
			name = xName;
		}
		
		public double addFile(double xfileSize){
			fileSize.add(xfileSize);
			freeSpace = freeSpace - xfileSize;
			if (freeSpace < 0){
				fileSize.remove(xfileSize);
				System.out.println("Capacity reached. File removed.");
				freeSpace = freeSpace + xfileSize;
			}
			return freeSpace;
		}
		public double deleteFile(int place){
			
			double junk = fileSize.remove(place);
			freeSpace += junk;
			return freeSpace;
		}
		public boolean isFull(){
			if (freeSpace == 0){
				return true;
			}
			else{
				return false;
			}
		}
		public boolean isEmpty(){
			if (freeSpace == totalCapacity){
				return true;
			}
			else{
				return false;
			}
		}
		

}
