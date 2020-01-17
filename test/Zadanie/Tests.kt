package Zadanie

import lesson6.task1.dateDigitToStr
import lesson8.task1.Direction.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import java.lang.IllegalArgumentException

class Tests {
    fun dateDigitToStr() {
        assertEquals("двадцатое октября девятьсот семьдесят девятого  года двадцать три часа сорок девять минут  двадцать семь секунд ", dateDigitToStr("20.10.979 23.49.27"))
        assertEquals("двенадцатое ноября две тысячи двести тридцать четвертого  года три часа  одиннадцать минут  пятьдесят секунд ", dateDigitToStr("12.11.2234 03:11:50"))
        assertEquals("", dateDigitToStr("12.13.2234 03:11:50"))
        assertEquals("первое января первого  года ноль часов  ноль минут  ноль секунд", dateDigitToStr("1.1.1 00:00:00"))
        assertEquals("", dateDigitToStr("111.111.111 00:00:00"))
        assertEquals("первое февраля третьего  года четыре часа  пять минут  шесть секунд ", dateDigitToStr("1.2.3 04:05:06"))
    }
}