Existem 4 classes de redes sociais com comportamentos diferentes que implementam a mesma interface. A fim de não ferir o Interface Segregation Principle, estamos refatorando todas as classes a fim de evitar que as mesmas usem uma interface única e precisem implementar métodos aonde não se vê necessidade.

##Código:

````
fun main() {
​
}
​
interface SocialMedia {
    fun login(): String {
    return "Logged"
   }

    fun postPictures() : String
    fun postStory(): String
    fun postVideos(): String
    fun blogPost(): String
    fun tweet(): String
}
​
class Instagram : SocialMedia {
    override fun postPictures(): String {
    return "photo posted"
    }
​
    override fun postStory(): String {
    return "videos posted"
    }
​
    override fun postVideos(): String {
    TODO("Not yet implemented")
    }
​
    override fun blogPost(): String {
    TODO("Not yet implemented")
    }
​
    override fun tweet(): String {
    TODO("Not yet implemented")
    }
​
    fun postReels(): String {
    return "reels posted"
    }
}
​
class Facebook : SocialMedia {
    override fun postPictures(): String {
    return "photo posted"
    }
​
    override fun postStory(): String {
    return "videos posted"
    }
​
    override fun postVideos(): String {
    TODO("Not yet implemented")
    }
​
    override fun blogPost(): String {
    return "posted text"
    }
​
    override fun tweet(): String {
    TODO("Not yet implemented")
    }
​
    fun createAffinityGroups(): String {
        return "created group"
        }
}
​
class TickTock : SocialMedia {
    override fun postPictures(): String {
    TODO("Not yet implemented")
    }
​
    override fun postStory(): String {
    TODO("Not yet implemented")
    }
​
    override fun postVideos(): String {
    return "videos posted"
    }
​
    override fun blogPost(): String {
    TODO("Not yet implemented")
    }
​
    override fun tweet(): String {
    TODO("Not yet implemented")
    }
}
​
class Twitter : SocialMedia {
    override fun postPictures(): String {
    return "photo posted"
    }
​
    override fun postStory(): String {
    TODO("Not yet implemented")
    }
​
    override fun postVideos(): String {
    return "videos posted"
    }
​
    override fun blogPost(): String {
    return "posted text"
    }
​
    override fun tweet(): String {
    return "posted tweet"
    }
}
````


##Primeiro Desenho (Fluxo Original)

<img src="/home/natalia/IdeaProjects/InterfaceSegregationProject/original.png" alt="Desenho do fluxo não refatorado"/>

##Segundo Desenho  (Fluxo Refatorado)

<img src="/home/natalia/IdeaProjects/InterfaceSegregationProject/refactored.png" alt="Desenho do fluxo não refatorado"/>
