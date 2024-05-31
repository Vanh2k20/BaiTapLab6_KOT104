package com.example.lab6

data class Movie(
    val title: String,
    val year: String,
    val posterUrl: String,
    val duration : Int,
    val releaseDate : String,
    val genre : String,
    val shotDescription : String
) {
    companion object {
        fun getSampleMovies(): MutableList<Movie> {
            val listMovie = mutableListOf<Movie>()
            listMovie.add(Movie("Xứ sở các nguyên tố","2024",
                "https://i.pinimg.com/564x/5f/46/8f/5f468f8e09ff0ae393eb14f1c37626c2.jpg",
                156, "22/5/2024","Anime","Elemental đưa khán giả vào một thành phố ảo lạ thường, nơi mà các dân cư bao gồm người lửa, người nước, người đất và người khí."))
            listMovie.add(Movie("Moana","2020",
                "https://i.pinimg.com/564x/e7/54/45/e754451514f38b0013f884d769dc0754.jpg",
                108, "18/02/2017","Anime","Moana là một cô gái thích khám phá biển, con gái duy nhất của một thuyền trưởng hoa tiêu. Khi gia đình cần sự giúp đỡ, cô ấy sẵn sàng tham gia vào chuyến hành trình đậm chất sử thi. Bộ phim sẽ có xuất hiện những á thần và linh hồn từ các thần thoại có thật."))
            listMovie.add(Movie("Công chúa tóc xù","2012",
                "https://i.pinimg.com/564x/29/38/fe/2938fe74fc2ed9967fa9239400a78771.jpg",
                156, "03/35/2013","Anime","Nằm ở Scotland trong một thời gian chắc chắn và huyền bí, bộ phim này có công chúa Merida (Kelly MacDonald), một cung thủ đầy tham vọng và con gái của Nữ hoàng Elinor (Dame Emma Thompson). Merida làm cho một sự lựa chọn liều lĩnh giải phóng sự nguy hiểm ngoài ý muốn và buộc cô phải vào mùa xuân vào hành động để thiết lập mọi thứ đúng."))
            listMovie.add(Movie("Nữ hoàng băng giá","2019",
                "https://i.pinimg.com/564x/2c/45/ba/2c45ba886065a2975c4f9a1a5077d58a.jpg",
                156, "11/05/2021","Anime","Anna, Elsa, Kristoff, Olaf và Sven rời Arendelle đi du lịch đến một khu rừng cổ đại, mùa thu của một vùng đất bị mê hoặc. Họ bắt đầu tìm nguồn gốc của quyền hạn của Elsa để cứu vương quốc của họ."))
            listMovie.add(Movie("RIO","2024",
                "https://i.pinimg.com/564x/ca/92/a5/ca92a58b84ac93f39420f4661d19dba2.jpg",
                156, "06/06/2018","Anime","Blu là chú vẹt đuôi dài Macaw được thuần hóa và chưa bao giờ tập bay, sống một cuộc sống thoải mái với người bạn thân Linda cùng cậu chủ. Blu và Linda đều tưởng Blu là cá thể duy nhất còn sót lại của loài Macaw, nhưng rồi họ phát hiện ra còn một “cô” Macaw cái tại Rio de Janeiro, cả hai quyết định thực hiện của hành trình mạo hiểm để tìm Jewel, cô Macaw của Blu."))
            listMovie.add(Movie("TinkerBell","2024",
                "https://i.pinimg.com/564x/9b/d6/1d/9bd61d1dbb626991d2ab5e23180184a1.jpg",
                156, "27/05/2009","Anime","Tinker Bell và bạn của cô Fawn, một nữ thần tiên không ngại phá vỡ các quy tắc để giúp đỡ một con vật. Nhưng sinh vật này, đồ sộ và tuyệt vời với đôi mắt xanh rực rỡ, không được chào đón trong Pixie Hollow."))
            listMovie.add(Movie("Lion King","2024",
                "https://i.pinimg.com/564x/c0/14/8a/c0148ac1189d9f0f8732baa6a0ec1942.jpg",
                156, "20/10/2011","Anime","Bộ phim Vua Sư Tử được đạo diễn bởi Jon Favreau sẽ đưa khán giả đến với xavan Châu Phi rộng lớn nơi vị vua tương lai Simba được sinh ra."))

            return listMovie
        }
    }
}