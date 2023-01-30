package com.example.asanbekov_3_6

data class Music(
    val name: String = "Музыка",
    val author: String = "Автор",
    val time: Int = 0
){
    companion object{

        fun createTime(second: Int): String {
            if(second < 10){
                return "0:0$second"
            }
            else if(second < 60){
                return "0:$second"
            }else if ((second%60).toString().length == 1){
                return (second/60).toString() + ":0" + (second%60).toString()
            }else{
                return (second/60).toString() + ":" + (second%60).toString()
            }
        }
    }

}
