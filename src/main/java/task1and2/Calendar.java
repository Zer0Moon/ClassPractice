package task1and2;

    public class Calendar {
        
        private int year;
        private int month;
        private int day;
        
    public Calendar() {
        
        this.year = 2020;
        this.month = 1;
        this.day = 1;
    }

    public Calendar(Calendar anotherCalendar) {
        
        this.year = anotherCalendar.year;
        this.month = anotherCalendar.month;
        this.day = anotherCalendar.day;
        
    }
    
    public Calendar (int year, int month, int day) {
        
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
    public boolean isLeapYear() {
        
        
        if (year % 4 != 0 && month == 2) {
            return false;
        }
        
        else if (year % 100 != 0 && month == 2) {
            return true;
        }
        
        else if (year % 400 != 0 && month == 2) {
            return false;
        }
        
        else if (month == 2) {
            return true;
        }
        else {
            return false;
        }
    }
       
    public boolean equals(Calendar anotherCalendar) {
        
        return year == anotherCalendar.year && month == anotherCalendar.month && day == anotherCalendar.day;
        
    }
    
    @Override
    public String toString() {
        
        String str = String.format("%-1d/%-1d/%-1d",month,day,year);
        return str;
    }
    
    public void setYear(int year) {
        
        this.year = year;
        
    }
    
    public void setMonth (int month) {
        
        this.month = month;
    }
    
    public void setDay(int day) {
        
        this.day = day;
    }
    
    public int getDaysInMonth() {
        
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return 31;
        }
        else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        }
        
        else if (month == 2 && isLeapYear() == true) {
            return 29;
        }
        else {
            return 28;
        }
    }
    
    public int increaseYear() {
        return year++;
    }
    
    public int increaseMonth() {
        
       if (month == 12) {
          increaseYear(); 
       return month = 1;
       
       }
       else if (month < 12) {
           return month++;
       }
       else return -1;
       }
    
    public int increaseDays() {
        
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
        if (day < 31) {
            return day++;
        }else if (day == 31) {
            increaseMonth();
            return day = 1;
                    
                    }
        }
        if  (month == 4 || month == 6 || month == 9 || month == 11) {
        if (day < 30) {
            return day++;
        } else if ( day == 30) {
            increaseMonth();
            return day = 1;
        }
        
    }
        if (month == 2 && isLeapYear() == true) {
            if (day < 29) {
                return day++;
            
        } else if (day == 29) {
            increaseMonth();
            return day = 1;
        }
    
    }
        if (month == 2 && isLeapYear() == false) {
            if (day < 28) {
                return day++;
            } else if (day == 28) {
                increaseMonth();
                return day = 1;
            }
        }
        return -1;
    }
    
    public int getYear(int year) {
        return year;
    }
    
    public int getMonth(int month) {
        return month;
    }
    
    public int getDay(int day) {
        return  day;
    }
    
   }
