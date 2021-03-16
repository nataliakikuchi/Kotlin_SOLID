fun main() {

}

class Twitter : SocialMedia {
    override fun postPictures(): String {
        return "photo posted"
    }

    override fun postStory(): String {
        TODO("Not yet implemented")
    }

    override fun postVideos(): String {
        return "videos posted"
    }

    override fun blogPost(): String {
        return "posted text"
    }

    override fun tweet(): String {
        return "posted tweet"
    }
}