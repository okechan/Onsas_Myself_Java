package com.example.oksak.onsas_myself_java;

public class Japanese_changer {
    public String str;
    public String main_weather(String name){
        switch (name){
            case "Clear":
                str="晴れ";
                break;
            case "Clouds":
                str= "曇り";
                break;
            case "Rain":
                str="雨";
                break;
            case "Snow":
                str="雪";
                break;
            case "Thunderstorm":
                str="雷";
                break;
            case "Mist":
                str="霧";
                default:
                    str=name;
                    break;
        }
        return str;
    }

    public String description(String name) {
        switch (name) {
            case "thunderstorm with light rain":
                str = "雷を伴った小雨";
                break;
            case "thunderstorm with rain":
                str = "雷雨";
                break;
            case "thunderstorm with heavy rain":
                str = "強い雷雨";
                break;
            case "light thunderstorm":
                str = "弱い雷";
                break;
            case "thunderstorm":
                str = "雷";
                break;
            case "heavy thunderstorm":
                str = "強い雷";
                break;
            case "ragged thunderstorm":
                str = "時々雷";
                break;
            case "thunderstorm with light drizzle":
                str = "雷を伴った弱い霧雨";
                break;
            case "thunderstorm with heavy drizzle":
                str = "雷を伴った強い霧雨";
                break;
            case "light intensity drizzle":
                str = "弱い霧雨";
                break;
            case "drizzle":
                str = "霧雨";
                break;
            case "heavy intensity drizzle":
                str = "強い霧雨";
                break;
            case "light intensity drizzle rain":
                str = "弱い雨と霧雨";
                break;
            case "drizzle rain":
                str = "霧雨と雨";
                break;
            case "heavy intensity drizzle rain":
                str = "強い雨と霧雨";
                break;
            case "shower rain and drizzle":
                str = "にわか雨と霧雨";
                break;
            case "heavy intensity rain and drizzle":
                str = "強いにわか雨と霧雨";
                break;
            case "shower drizzle":
                str = "にわか霧雨";
                break;
            case "light rain":
                str = "小雨";
                break;
            case ",moderate rain":
                str = "雨";
                break;
            case "heavy intensity rain":
                str = "強い雨";
                break;
            case "very heavy rain":
                str = "非常に激しい雨";
                break;
            case "extreme rain":
                str = "猛烈な雨";
                break;
            case "freezing rain":
                str = "雨氷";
                break;
            case "light intensity shower rain":
                str = "弱いにわか雨";
                break;
            case "shower rain":
                str = "にわか雨";
                break;
            case "heavy intensity shower rain":
                str = "強いにわか雨";
                break;
            case "ragged shower rain":
                str = "時々にわか雨";
                break;
            case "light snow":
                str = "小雪";
                break;
            case "snow":
                str = "雪";
                break;
            case "heavy snow":
                str = "強い雪";
                break;
            case "sleet":
                str = "凍雨";
                break;
            case "shower sleet":
                str = "にわか凍雨";
                break;
            case "light rain and snow":
                str = "弱いみぞれ";
                break;
            case "rain and snow":
                str = "みぞれ";
                break;
            case "light shower snow":
                str = "弱いにわか雪";
                break;
            case "shower snow":
                str = "にわか雪";
                break;
            case "heavy shower snow":
                str = "強いにわか雪";
                break;
            case "mist":
                str = "もや";
                break;
            case "smoke":
                str = "煙";
                break;
            case "haze":
                str = "煙霧";
                break;
            case "sand,dust whirls":
                str = "砂塵旋風";
                break;
            case "fog":
                str = "霧";
                break;
            case "sand":
                str = "降砂";
                break;
            case "dust":
                str = "降塵";
                break;
            case "volcanic ash":
                str = "降灰";
                break;
            case "squalls":
                str = "スコール";
                break;
            case "tornado":
                str = "竜巻";
                break;
            case "clear sky":
                str = "快晴";
                break;
            case "few clouds":
                str = "晴れ";
                break;
            case "scattered clouds":
                str = "千切れ雲";
                break;
            case "broken clouds":
                str = "雲がち";
                break;
            case "overcast clouds":
                str = "曇り";
                break;
        }
        return str;
    }
}
