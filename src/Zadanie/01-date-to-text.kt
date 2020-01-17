fun dateDigitToStr(digital: String): String {
    val none: String = "   "
    val parts = digital.split(".", " ", ":")
    var day = parts[0].toInt()
    var year = parts[2].toInt()
    var hours = parts[3].toInt()
    var minutes = parts[4].toInt()
    var sec = parts[5].toInt()
    var daystr = ""
    var mounth = ""
    var yearstr = ""
    var hoursstr = ""
    var minutesstr = ""
    var secstr = ""
    if (day < 0 || day > 32)
        return none
    if (year < 0 || year > 2999)
        return none
    if (hours < 0 || hours > 24)
        return none
    if (minutes < 0 || minutes > 60)
        return none
    if (sec < 0 || sec > 60)
        return none
    if (day == 1) {
        daystr = "первое"
    }
    if (day == 2) {
        daystr = "второе"
    }
    if (day == 3) {
        daystr = "третье"
    }
    if (day == 4) {
        daystr = "четвёртое"
    }
    if (day == 5) {
        daystr = "пятое"
    }
    if (day == 6) {
        daystr = "шестое"
    }
    if (day == 7) {
        daystr = "седьмое"
    }
    if (day == 8) {
        daystr = "восьмое"
    }
    if (day == 9) {
        daystr = "девятое"
    }
    if (day == 10) {
        daystr = "десятое"
    }
    if (day == 11) {
        daystr = "одиннадцатое"
    }
    if (day == 12) {
        daystr = "двенадцатое"
    }
    if (day == 13) {
        daystr = "тринадцатое"
    }
    if (day == 14) {
        daystr = "четырнадцатое"
    }
    if (day == 15) {
        daystr = "пятнадцатое"
    }
    if (day == 16) {
        daystr = "шестнадцатое"
    }
    if (day == 17) {
        daystr = "семнадцатое"
    }
    if (day == 18) {
        daystr = "восемнадцатое"
    }
    if (day == 19) {
        daystr = "девятнадцатое"
    }
    if (day == 20) {
        daystr = "двадцатое"
    }
    if (day == 30) {
        daystr = "тридцатое"
    }

    if (day in 21..29)
        daystr = "двадцать "

    if (day > 30)
        daystr = "тридацть "

    if (day in 21..31 && day != 30) {
        day %= 10
        if (day == 1) {
            daystr = daystr.plus("первое")
        }
        if (day == 2) {
            daystr = daystr.plus("второе")
        }
        if (day == 3) {
            daystr = daystr.plus("третье")
        }
        if (day == 4) {
            daystr = daystr.plus("четвёртое")
        }
        if (day == 5) {
            daystr = daystr.plus("пятое")
        }
        if (day == 6) {
            daystr = daystr.plus("шестое")
        }
        if (day == 7) {
            daystr = daystr.plus("седьмое")
        }
        if (day == 8) {
            daystr = daystr.plus("восьмое")
        }
        if (day == 9) {
            daystr = daystr.plus("девятое")
        }
    }
    if (parts[1] == "1") {
        mounth = "января"
        if (day > 31)
            return none
    } else if (parts[1] == "2") {
        mounth = "февраля"
        if (day > 29)
            return none
    } else if (parts[1] == "3") {
        mounth = "марта"
        if (day > 31)
            return none
    } else if (parts[1] == "4") {
        mounth = "апреля"
        if (day > 30)
            return none
    } else if (parts[1] == "5") {
        mounth = "мая"
        if (day > 31)
            return none
    } else if (parts[1] == "6") {
        mounth = "июня"
        if (day > 30)
            return none
    } else if (parts[1] == "7") {
        mounth = "июля"
        if (day > 31)
            return none
    } else if (parts[1] == "8") {
        mounth = "августа"
        if (day > 31)
            return none
    } else if (parts[1] == "9") {
        mounth = "сентября"
        if (day > 30)
            return none
    } else if (parts[1] == "10") {
        mounth = "октября"
        if (day > 31)
            return none
    } else if (parts[1] == "11") {
        mounth = "ноября"
        if (day > 30)
            return none
    } else if (parts[1] == "12") {
        mounth = "декабря"
        if (day > 31)
            return none
    } else return none
    if (year in 1000..1999) {
        yearstr = "одна тысяча "
        year -= 1000
    }
    if (year > 1999) {
        yearstr = "две тысячи "
        year -= 2000
    }
    var yeardin = year / 100
    if (yeardin == 1) {
        yearstr = yearstr.plus("сто ")
    }
    if (yeardin == 2) {
        yearstr = yearstr.plus("двести ")
    }
    if (yeardin == 3) {
        yearstr = yearstr.plus("триста ")
    }
    if (yeardin == 4) {
        yearstr = yearstr.plus("четыреста ")
    }
    if (yeardin == 5) {
        yearstr = yearstr.plus("пятьсот ")
    }
    if (yeardin == 6) {
        yearstr = yearstr.plus("шестьсот ")
    }
    if (yeardin == 7) {
        yearstr = yearstr.plus("семьсот ")
    }
    if (yeardin == 8) {
        yearstr = yearstr.plus("восемьсот ")
    }
    if (yeardin == 9) {
        yearstr = yearstr.plus("девятьсот ")
    }
    yeardin = year % 100
    if (yeardin == 1) {
        yearstr = yearstr.plus("первого ")
    }
    if (yeardin == 2) {
        yearstr = yearstr.plus("второго ")
    }
    if (yeardin == 3) {
        yearstr = yearstr.plus("третьего ")
    }
    if (yeardin == 4) {
        yearstr = yearstr.plus("четвертого ")
    }
    if (yeardin == 5) {
        yearstr = yearstr.plus("пятого ")
    }
    if (yeardin == 6) {
        yearstr = yearstr.plus("шестого ")
    }
    if (yeardin == 7) {
        yearstr = yearstr.plus("седьмого ")
    }
    if (yeardin == 8) {
        yearstr = yearstr.plus("восьмого ")
    }
    if (yeardin == 9) {
        yearstr = yearstr.plus("девятого ")
    }
    if (yeardin == 10) {
        yearstr = yearstr.plus("десятого ")
    }
    if (yeardin == 11) {
        yearstr = yearstr.plus("одиннадцатого ")
    }
    if (yeardin == 12) {
        yearstr = yearstr.plus("двенадцатого ")
    }
    if (yeardin == 13) {
        yearstr = yearstr.plus("тринадцатого ")
    }
    if (yeardin == 14) {
        yearstr = yearstr.plus("четырнадцатьго ")
    }
    if (yeardin == 15) {
        yearstr = yearstr.plus("дятнадцатого ")
    }
    if (yeardin == 16) {
        yearstr = yearstr.plus("шестнадцатого ")
    }
    if (yeardin == 17) {
        yearstr = yearstr.plus("семнадцатого ")
    }
    if (yeardin == 18) {
        yearstr = yearstr.plus("восемнадцатого ")
    }
    if (yeardin == 19) {
        yearstr = yearstr.plus("девятнадцатого ")
    }
    if (yeardin == 20) {
        yearstr = yearstr.plus("двадцатого ")
    }
    if (yeardin == 30) {
        yearstr = yearstr.plus("тридцатого ")
    }
    if (yeardin == 40) {
        yearstr = yearstr.plus("сорокового ")
    }
    if (yeardin == 50) {
        yearstr = yearstr.plus("пятидесятого ")
    }
    if (yeardin == 60) {
        yearstr = yearstr.plus("шестидесятого ")
    }
    if (yeardin == 70) {
        yearstr = yearstr.plus("семидесятого ")
    }
    if (yeardin == 80) {
        yearstr = yearstr.plus("восьмидесятого ")
    }
    if (yeardin == 90) {
        yearstr = yearstr.plus("девяностого ")
    }
    if (yeardin in 21..29)
        yearstr = yearstr.plus("двадцать ")
    if (yeardin in 31..39)
        yearstr = yearstr.plus ("тридцать ")
    if (yeardin in 41..49)
        yearstr = yearstr.plus ("сорок ")
    if (yeardin in 51..59)
        yearstr = yearstr.plus ("пятьдесят ")
    if (yeardin in 61..69)
        yearstr = yearstr.plus ("шестьдесят ")
    if (yeardin in 71..79)
        yearstr = yearstr.plus ("семьдесят ")
    if (yeardin in 81..89)
        yearstr = yearstr.plus ("восемьдесят ")
    if (yeardin in 91..99)
        yearstr = yearstr.plus ("девяносто ")
    if (year > 20 ) {
        year %= 10
        if (year == 1) {
            yearstr = yearstr.plus("первого ")
        }
        if (year == 2) {
            yearstr = yearstr.plus("второго ")
        }
        if (year == 3) {
            yearstr = yearstr.plus("третьего ")
        }
        if (year == 4) {
            yearstr = yearstr.plus("четвертого ")
        }
        if (year == 5) {
            yearstr = yearstr.plus("пятого ")
        }
        if (year == 6) {
            yearstr = yearstr.plus("шестого ")
        }
        if (year == 7) {
            yearstr = yearstr.plus("седьмого ")
        }
        if (year == 8) {
            yearstr = yearstr.plus("восьмого ")
        }
        if (year == 9) {
            yearstr = yearstr.plus("девятого ")
        }
    }
    if (hours == 0) {
        hoursstr = "ноль часов "
    }
    if (hours == 1) {
        hoursstr = "один час "
    }
    if (hours == 2) {
        hoursstr = "два часа "
    }
    if (hours == 3) {
        hoursstr = "три часа "
    }
    if (hours == 4) {
        hoursstr = "четыре часа "
    }
    if (hours == 5) {
        hoursstr = "пять часов "
    }
    if (hours == 6) {
        hoursstr = "шесть часов "
    }
    if (hours == 7) {
        hoursstr = "семь часов "
    }
    if (hours == 8) {
        hoursstr = "восемь часов "
    }
    if (hours == 9) {
        hoursstr = "девять часов "
    }
    if (hours == 10) {
        hoursstr = "десять часов "
    }
    if (hours == 11) {
        hoursstr = "одиннадцать часов "
    }
    if (hours == 12) {
        hoursstr = "двенадцать часов "
    }
    if (hours == 13) {
        hoursstr = "тринадцать часов "
    }
    if (hours == 14) {
        hoursstr = "четырнадцать часов "
    }
    if (hours == 15) {
        hoursstr = "пятнадцать часов "
    }
    if (hours == 16) {
        hoursstr = "шестнадцать часов "
    }
    if (hours == 17) {
        hoursstr = "семнадцать часов "
    }
    if (hours == 18) {
        hoursstr = "восемнадцать часов "
    }
    if (hours == 19) {
        hoursstr = "девятнадцать часов "
    }
    if (hours == 20) {
        hoursstr = "двадчать часов "
    }
    if (hours == 21) {
        hoursstr = "двадцать один час "
    }
    if (hours == 22) {
        hoursstr = "двадцать два часа"
    }
    if (hours == 23) {
        hoursstr = "двадцать три часа"
    }
    if (minutes == 0) {
        minutesstr = "ноль минут "
    }
    if (minutes ==1 ) {
        minutesstr = "одна минута "
    }
    if (minutes ==2 ) {
        minutesstr = "две минуты "
    }
    if (minutes ==3 ) {
        minutesstr = "три минуты "
    }
    if (minutes ==4 ) {
        minutesstr = "четыре минуты "
    }
    if (minutes ==5 ) {
        minutesstr = "пять минут "
    }
    if (minutes ==6 ) {
        minutesstr = "шесть минут "
    }
    if (minutes == 7) {
        minutesstr = "семь минут "
    }
    if (minutes ==8 ) {
        minutesstr = "восемь минут "
    }
    if (minutes ==9 ) {
        minutesstr = "девять минут "
    }
    if (minutes ==10 ) {
        minutesstr = "десять минут "
    }
    if (minutes ==11 ) {
        minutesstr = "одиннадцать минут "
    }
    if (minutes ==12 ) {
        minutesstr = "двенадцать минут "
    }
    if (minutes == 13) {
        minutesstr = "тринадцать минут "
    }
    if (minutes ==14 ) {
        minutesstr = "четырнадцать минут "
    }
    if (minutes ==15 ) {
        minutesstr = "пятнадцать минут "
    }
    if (minutes ==16 ) {
        minutesstr = "шестнадцать минут "
    }
    if (minutes ==17 ) {
        minutesstr = "семнадцать минут "
    }
    if (minutes ==18 ) {
        minutesstr = "восемнадцать минут "
    }
    if (minutes ==19 ) {
        minutesstr = "девятнадцать минут "
    }
    if (minutes ==20 ) {
        minutesstr = "двадцать минут"
    }
    if (minutes ==30 ) {
        minutesstr = "тридцать минут "
    }
    if (minutes ==40 ) {
        minutesstr = "сорок минут "
    }
    if (minutes ==50 ) {
        minutesstr = "пятьдесят минут "
    }
    if (minutes in 21..29)
        minutesstr = minutesstr.plus("двадцать ")
    if (minutes in 31..39)
        minutesstr = minutesstr.plus("тридцать ")
    if (minutes in 41..49)
        minutesstr = minutesstr.plus("сорок ")
    if (minutes in 51..59)
        minutesstr = minutesstr.plus("пятьдесят ")
    var minutesdin = minutes % 10
    if (minutesdin != 0 && minutes > 20) {
        minutes %= 10
        if ( minutes == 1) {
            minutesstr = minutesstr.plus("одна минута ")
        }
        if ( minutes == 2) {
            minutesstr = minutesstr.plus("две минуты ")
        }
        if ( minutes == 3) {
            minutesstr = minutesstr.plus("три минуты ")
        }
        if ( minutes == 4) {
            minutesstr = minutesstr.plus("четыре минуты ")
        }
        if ( minutes == 5) {
            minutesstr = minutesstr.plus("пять минут ")
        }
        if ( minutes == 6) {
            minutesstr = minutesstr.plus("шесть минут ")
        }
        if ( minutes == 7) {
            minutesstr = minutesstr.plus("семь минут ")
        }
        if ( minutes == 8) {
            minutesstr = minutesstr.plus("восемь минут ")
        }
        if ( minutes == 9) {
            minutesstr = minutesstr.plus("девять минут ")
        }



    }
    if (sec == 0) {
        secstr = "ноль секунд "
    }
    if (sec ==1 ) {
        secstr = "одна секунда "
    }
    if (sec ==2 ) {
        secstr = "две секунды "
    }
    if (sec ==3 ) {
        secstr = "три секунды "
    }
    if (sec ==4 ) {
        secstr = "четыре секунды "
    }
    if (sec ==5 ) {
        secstr = "пять секунд "
    }
    if (sec ==6 ) {
        secstr = "шесть секунд "
    }
    if (sec == 7) {
        secstr = "семь секунд "
    }
    if (sec ==8 ) {
        secstr = "восемь секунд "
    }
    if (sec ==9 ) {
        secstr = "девять секунд "
    }
    if (sec ==10 ) {
        secstr = "десять секунд "
    }
    if (sec ==11 ) {
        secstr = "одиннадцать секунд "
    }
    if (sec ==12 ) {
        secstr = "двенадцать секунд "
    }
    if (sec == 13) {
        secstr = "тринадцать секунд "
    }
    if (sec ==14 ) {
        secstr = "четырнадцать секунд "
    }
    if (sec ==15 ) {
        secstr = "пятнадцать секунд "
    }
    if (sec ==16 ) {
        secstr = "шестнадцать секунд "
    }
    if (sec ==17 ) {
        secstr = "семнадцать секунд "
    }
    if (sec ==18 ) {
        secstr = "восемнадцать секунд "
    }
    if (sec ==19 ) {
        secstr = "девятнадцать секунд "
    }
    if (sec ==20 ) {
        secstr = "двадцать секунд"
    }
    if (sec ==30 ) {
        secstr = "тридцать секунд "
    }
    if (sec ==40 ) {
        secstr = "сорок секунд "
    }
    if (sec ==50 ) {
        secstr = "пятьдесят секунд "
    }
    if (sec in 21..29)
        secstr = secstr.plus("двадцать ")
    if (sec in 31..39)
        secstr = secstr.plus("тридцать ")
    if (sec in 41..49)
        secstr = secstr.plus("сорок ")
    if (sec in 51..59)
        secstr = secstr.plus("пятьдесят ")
    var secdin = sec % 10
    if (secdin != 0 && sec > 20) {
        sec %= 10
        if ( sec == 1) {
            secstr = secstr.plus("одна секунда ")
        }
        if ( sec == 2) {
            secstr = secstr.plus("две секунды ")
        }
        if ( sec == 3) {
            secstr = secstr.plus("три секунды ")
        }
        if ( sec == 4) {
            secstr = secstr.plus("четыре секунды ")
        }
        if ( sec == 5) {
            secstr = secstr.plus("пять секунд ")
        }
        if ( sec == 6) {
            secstr = secstr.plus("шесть секунд ")
        }
        if ( sec == 7) {
            secstr = secstr.plus("семь секунд ")
        }
        if ( sec == 8) {
            secstr = secstr.plus("восемь секунд ")
        }
        if ( sec == 9) {
            secstr = secstr.plus("девять секунд ")
        }



    }


    val result: String = "$daystr $mounth $yearstr года $hoursstr $minutesstr $secstr"
    println("$result")
    return result
}

fun main() {
    dateDigitToStr("1.2.3 04:05:06")
}
