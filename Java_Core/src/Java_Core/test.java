package Java_Core;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class test {
	public static void main(String[] args) {
        // Chuỗi đại diện cho ngày bắt đầu và kết thúc
        String startDateString = "2024-02-02";
        String endDateString = "2024-03-20";
        
        // Định dạng ngày
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        
        try {
            // Chuyển đổi chuỗi thành đối tượng Date
            Date startDate = format.parse(startDateString);
            Date endDate = format.parse(endDateString);
            
            // Tính số tháng và số ngày đã qua
            long diffInMillies = Math.abs(endDate.getTime() - startDate.getTime());
            long diffInDays = diffInMillies / (1000 * 60 * 60 * 24);
            long monthsPassed = diffInDays / 30;
            long remainingDays = diffInDays % 30;
            
            // Hiển thị kết quả
            System.out.println("Số tháng đã qua: " + monthsPassed);
            System.out.println("Số ngày đã qua: " + diffInDays);
            System.out.println("Số ngày còn lại sau khi tính số tháng: " + remainingDays);
            
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
