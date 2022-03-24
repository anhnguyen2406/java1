
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class HumanResources {
	public static void menu(){
		System.out.println("Nhan 1 de them nhan vien");
		System.out.println("Nhan 2 de xem thong tin bo phan");
		System.out.println("Nhan 3 de tim kiem nhan vien");
		System.out.println("Nhan 4 hien thi luong nhan vien");
		System.out.println("Nhan 5 de hien thi luong tang dan");
		System.out.println("Nhan 6 de hien thi nhan vien theo bo phan");
		System.out.println("Nhan 7 de thoat");
	}
	public static void main(String[] args) {

		ArrayList<Department> departments = new ArrayList<>();
		departments.add(new Department("Business", 1, 0));
		departments.add(new Department("Project", 2, 0));
		departments.add(new Department("Technical", 3, 0));
		ArrayList<Staff> staffs = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		boolean check=true;

		do {
			menu();
			System.out.println("Choose :");
			String line = scanner.nextLine();
			switch (line) {
			case "1": {
				System.out.println("Nhan a de them nhan vien");
				System.out.println("Nhan b de them quan li");
				String type = scanner.nextLine();
				switch (type) {
				case "a": {
					Staff staff;
					System.out.println("Nhap ma so nhan vien");
					int maSoNV = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Nhan ten nhan vien");
					String ten = scanner.nextLine();
					System.out.println("Nhap tuoi nhan vien");
					int tuoi = scanner.nextInt();
					System.out.println("Nhap he so luong");
					int heSoLuong = scanner.nextInt();
					System.out.println("Nhap ngay vao lam");
					int ngayVaoLam = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Nhap so ngay nghi");
					int soNgayNghi = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Nhap so gio lam them");
					int soGioLamThem = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Nhan ten bo phan lam viec");
					String boPhanLamViec = scanner.nextLine();
					int index = 1;
					for (Department department : departments) {
						System.out.println("Nhap " + index + "de chon " + department.getTenBoPhan());
						index++;
					}
					int select = scanner.nextInt();
					scanner.nextLine();
					if (select > 0 && select <= departments.size()) {
						departments.get(select - 1).tangNV();
					}
					int luongNV = 0;
					staff = new Employee(maSoNV, ten, tuoi, heSoLuong, ngayVaoLam, boPhanLamViec, soNgayNghi, luongNV, soGioLamThem);
					luongNV = ((Employee) staff).calculateSalary();
					staffs.add(staff);
					staff.displayInformation();
					break;

				}
				case "b": {
					Staff staff;
					System.out.println("Nhap ma so nhan vien");
					int maSoNV = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Nhan ten nhan vien");
					String ten = scanner.nextLine();
					System.out.println("Nhap tuoi nhan vien");
					int tuoi = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Nhap he so luong");
					int heSoLuong = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Nhap ngay vao lam");
					int ngayVaoLam = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Nhan ten bo phan lam viec");
					String boPhanLamViec = scanner.nextLine();
					System.out.println("Nhap so ngay nghi");
					int soNgayNghi = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Nhap so chuc danh");
					String chucDanh = scanner.nextLine();
					int index = 1;
					int luongNV =0;
					for (Department department : departments) {
						System.out.println("Nhap" + index + "de chon" + department.getTenBoPhan());
						index++;
					}
					int select = scanner.nextInt();
					scanner.nextLine();
					if (select > 0 && select <= departments.size()) {
						departments.get(select - 1).tangNV();
					}
					staff=	new Manager(maSoNV, ten, tuoi, heSoLuong, ngayVaoLam, boPhanLamViec, soNgayNghi, luongNV, chucDanh);			
					luongNV = ((Manager) staff).calculateSalary();
					staffs.add(staff);
					staff.displayInformation();
					break;
					
				}				
				}
				break;
			}
			case "2": {
				System.out.println(departments);
				break;
			}
			case "3": {
				System.out.println("Nhap ten can tim");
				String tenCanTim = scanner.nextLine();
				for (Staff staff : staffs) {
					if (staff.getTen().equalsIgnoreCase(tenCanTim)) {
						staff.displayInformation();
					}
				}
				break;
			}
			case "4": {
				for (int i = 0; i < staffs.size(); i++) {
					System.out.print("ten NV "+staffs.get(i).ten +"luong NV "+ staffs.get(i).luongNV + "\t");
				}
				break;
			}
			case "5": {
				Collections.sort(staffs, new Comparator<Staff>() {

					@Override
					public int compare(Staff o1, Staff o2) {
						return(int) o1.getLuongNV() - o2.getLuongNV();
					}
				});
				for (Staff staff : staffs) {
					System.out.println("ten NV "+ staff.getTen()+"luong NV "+ staff.getLuongNV());
				}
				break;
			}
			case "6":{
				System.out.println("Nhap bo phan can hien thi");
				String boPhanTim= scanner.nextLine();
				for (Staff staff : staffs) {
					if (staff.getBoPhanLamViec().equalsIgnoreCase(boPhanTim)) {
						staff.displayInformation();
					}
				}
				break;
			}
			case"7":{
				check= false;
				System.out.println("Bye");
				break;
			}
			}
		}while(check);
	}
}



