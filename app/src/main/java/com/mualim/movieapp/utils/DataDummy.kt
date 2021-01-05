package com.mualim.movieapp.utils

import com.mualim.movieapp.R
import com.mualim.movieapp.data.MovieEntity
import com.mualim.movieapp.data.TvShowEntity

object DataDummy {

    fun generateDummyMovie(): List<MovieEntity> {
        val movies = ArrayList<MovieEntity>()

        movies.add(MovieEntity(1,
                "T-34",
                "2018",
                "War, Action, Drama, History",
                "2h 19m",
                68,
                "In 1944, a courageous group of Russian soldiers managed to escape from German captivity in a half-destroyed legendary T-34 tank. Those were the times of unforgettable bravery, fierce fighting, unbreakable love, and legendary miracles.",
                R.drawable.poster_t34
        ))

        movies.add(MovieEntity(2,
                "Spider-Man: Into the Spider-Verse",
                "2018",
                "Action, Adventure, Science Fiction, Comedy",
                "1h 57m",
                84,
                "Miles Morales is juggling his life between being a high school student and being a spider-man. When Wilson \"Kingpin\" Fisk uses a super collider, others from across the Spider-Verse are transported to this dimension.",
                R.drawable.poster_spiderman
        ))

        movies.add(MovieEntity(3,
                "Serenity",
                "2019",
                "Thriller, Mystery, Drama",
                "1h 42m",
                54,
                "The quiet life of Baker Dill, a fishing boat captain who lives on the isolated Plymouth Island, where he spends his days obsessed with capturing an elusive tuna while fighting his personal demons, is interrupted when someone from his past comes to him searching for help.",
                R.drawable.poster_serenity
        ))

        movies.add(MovieEntity(4,
                "Robin Hood",
                "2018",
                "Adventure, Action, Thriller",
                "1h 56m",
                59,
                "A war-hardened Crusader and his Moorish commander mount an audacious revolt against the corrupt English crown.",
                R.drawable.poster_robin_hood
        ))

        movies.add(MovieEntity(5,
                "Wreck-It Ralph ",
                "2012",
                "Family, Animation, Comedy, Adventure",
                "1h 41m",
                73,
                "Wreck-It Ralph is the 9-foot-tall, 643-pound villain of an arcade video game named Fix-It Felix Jr., in which the game's titular hero fixes buildings that Ralph destroys. Wanting to prove he can be a good guy and not just a villain, Ralph escapes his game and lands in Hero's Duty, a first-person shooter where he helps the game's hero battle against alien invaders. He later enters Sugar Rush, a kart racing game set on tracks made of candies, cookies and other sweets. There, Ralph meets Vanellope von Schweetz who has learned that her game is faced with a dire threat that could affect the entire arcade, and one that Ralph may have inadvertently started.",
                R.drawable.poster_ralph
        ))

        movies.add(MovieEntity(6,
                "Overlord",
                "2018",
                "Horror, War, Science Fiction",
                "1h 50m",
                67,
                "France, June 1944. On the eve of D-Day, some American paratroopers fall behind enemy lines after their aircraft crashes while on a mission to destroy a radio tower in a small village near the beaches of Normandy. After reaching their target, the surviving paratroopers realise that, in addition to fighting the Nazi troops that patrol the village, they also must fight against something else.",
                R.drawable.poster_overlord
        ))

        movies.add(MovieEntity(7,
                "Mortal Engines",
                "2018",
                "Adventure, Fantasy",
                "2h 9m",
                61,
                "Many thousands of years in the future, Earth’s cities roam the globe on huge wheels, devouring each other in a struggle for ever diminishing resources. On one of these massive traction cities, the old London, Tom Natsworthy has an unexpected encounter with a mysterious young woman from the wastelands who will change the course of his life forever.",
                R.drawable.poster_mortal_engines
        ))

        movies.add(MovieEntity(8,
                "Master Z: Ip Man Legacy ",
                "2018",
                "Action",
                "1h 47m",
                57,
                "Following his defeat by Master Ip, Cheung Tin Chi tries to make a life with his young son in Hong Kong, waiting tables at a bar that caters to expats. But it's not long before the mix of foreigners, money, and triad leaders draw him once again to the fight.",
                R.drawable.poster_master_z
        ))

        movies.add(MovieEntity(9,
                "Mary Queen of Scots",
                "2018",
                "Drama, History",
                "2h 4m",
                66,
                "In 1561, Mary Stuart, widow of the King of France, returns to Scotland, reclaims her rightful throne and menaces the future of Queen Elizabeth I as ruler of England, because she has a legitimate claim to the English throne. Betrayals, rebellions, conspiracies and their own life choices imperil both Queens. They experience the bitter cost of power, until their tragic fate is finally fulfilled.",
                R.drawable.poster_marry_queen
        ))

        movies.add(MovieEntity(10,
                "Avengers: Infinity War",
                "2018",
                "Adventure, Action, Science Fiction",
                "2h 29m",
                83,
                "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.",
                R.drawable.poster_infinity_war
        ))

        movies.add(MovieEntity(11,
                "How to Train Your Dragon: The Hidden World ",
                "2019",
                "Animation, Family, Adventure",
                "2h 19m",
                78,
                "As Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless’ discovery of an untamed, elusive mate draws the Night Fury away. When danger mounts at home and Hiccup’s reign as village chief is tested, both dragon and rider must make impossible decisions to save their kind.",
                R.drawable.poster_how_to_train
        ))

        movies.add(MovieEntity(12,
                "Glass",
                "2019",
                "Thriller, Drama, Science Fiction",
                "2h 9m",
                66,
                "In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men.",
                R.drawable.poster_glass
        ))

        movies.add(MovieEntity(13,
                "Fantastic Beasts: The Crimes of Grindelwald",
                "2018",
                "Adventure, Fantasy, Drama",
                "2h 14m",
                69,
                "Gellert Grindelwald has escaped imprisonment and has begun gathering followers to his cause—elevating wizards above all non-magical beings. The only one capable of putting a stop to him is the wizard he once called his closest friend, Albus Dumbledore. However, Dumbledore will need to seek help from the wizard who had thwarted Grindelwald once before, his former student Newt Scamander, who agrees to help, unaware of the dangers that lie ahead. Lines are drawn as love and loyalty are tested, even among the truest friends and family, in an increasingly divided wizarding world.",
                R.drawable.poster_crimes
        ))

        movies.add(MovieEntity(14,
                "Creed II",
                "2018",
                "Drama",
                "2h 10m",
                69,
                "Between personal obligations and training for his next big fight against an opponent with ties to his family's past, Adonis Creed is up against the challenge of his life.",
                R.drawable.poster_creed
        ))

        movies.add(MovieEntity(15,
                "Cold Pursuit",
                "2019",
                "Action, Crime, Thriller",
                "1h 59m",
                56,
                "The quiet family life of Nels Coxman, a snowplow driver, is upended after his son's murder. Nels begins a vengeful hunt for Viking, the drug lord he holds responsible for the killing, eliminating Viking's associates one by one. As Nels draws closer to Viking, his actions bring even more unexpected and violent consequences, as he proves that revenge is all in the execution.",
                R.drawable.poster_cold_persuit
        ))

        movies.add(MovieEntity( 16,
                "Bohemian Rhapsody",
                "2018",
                "Music, Drama",
                "2h 15m",
                80,
                "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.",
                R.drawable.poster_bohemian
        ))

        movies.add(MovieEntity(17,
                "Aquaman",
                "2018",
                "Action, Adventure, Fantasy",
                "2h 24m",
                69,
                "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.",
                R.drawable.poster_aquaman
        ))

        movies.add(MovieEntity(18,
                "Alita: Battle Angel",
                "2019",
                "Action, Science Fiction, Adventure",
                "2h 2m",
                71,
                "When Alita awakens with no memory of who she is in a future world she does not recognize, she is taken in by Ido, a compassionate doctor who realizes that somewhere in this abandoned cyborg shell is the heart and soul of a young woman with an extraordinary past.",
                R.drawable.poster_alita
        ))

        movies.add(MovieEntity(19,
                "Mary Queen of Scots",
                "2018",
                "Drama, History",
                "2h 4m",
                66,
                "In 1561, Mary Stuart, widow of the King of France, returns to Scotland, reclaims her rightful throne and menaces the future of Queen Elizabeth I as ruler of England, because she has a legitimate claim to the English throne. Betrayals, rebellions, conspiracies and their own life choices imperil both Queens. They experience the bitter cost of power, until their tragic fate is finally fulfilled.",
                R.drawable.poster_a_start_is_born
        ))

        return movies
    }

    fun generateDummyTvShow(): List<TvShowEntity> {
        val tvShows = ArrayList<TvShowEntity>()

        tvShows.add(TvShowEntity(1,
                "The Walking Dead",
                "2001",
                "Action & Adventure, Drama, Sci-Fi & Fantasy",
                "42m",
                80,
                "Sheriff's deputy Rick Grimes awakens from a coma to find a post-apocalyptic world dominated by flesh-eating zombies. He sets out to find his family and encounters many other survivors along the way.",
                R.drawable.poster_the_walking_dead
        ))

        tvShows.add(TvShowEntity(2,
                "The Umbrella Academy",
                "2019",
                "Action & Adventure, Sci-Fi & Fantasy, Drama",
                "55m",
                87,
                "A dysfunctional family of superheroes comes together to solve the mystery of their father's death, the threat of the apocalypse and more.",
                R.drawable.poster_the_umbrella
        ))

        tvShows.add(TvShowEntity(3,
                "The Simpsons",
                "1989",
                "Animation, Comedy, Family, Drama",
                "22m",
                78,
                "Set in Springfield, the average American town, the show focuses on the antics and everyday adventures of the Simpson family; Homer, Marge, Bart, Lisa and Maggie, as well as a virtual cast of thousands. Since the beginning, the series has been a pop culture icon, attracting hundreds of celebrities to guest star. The show has also made name for itself in its fearless satirical take on politics, media and American life in general.",
                R.drawable.poster_the_simpson
        ))

        tvShows.add(TvShowEntity(4,
                "Supernatural",
                "2005",
                "Drama, Mystery, Sci-Fi & Fantasy",
                "45m",
                81,
                "When they were boys, Sam and Dean Winchester lost their mother to a mysterious and demonic supernatural force. Subsequently, their father raised them to be soldiers. He taught them about the paranormal evil that lives in the dark corners and on the back roads of America ... and he taught them how to kill it. Now, the Winchester brothers crisscross the country in their '67 Chevy Impala, battling every kind of supernatural threat they encounter along the way.",
                R.drawable.poster_supernatural
        ))

        tvShows.add(TvShowEntity(5,
                "Supergirl",
                "2015",
                "Action, Adventure, Drama, Science Fiction",
                "42m",
                71,
                "Twenty-four-year-old Kara Zor-El, who was taken in by the Danvers family when she was 13 after being sent away from Krypton, must learn to embrace her powers after previously hiding them. The Danvers teach her to be careful with her powers, until she has to reveal them during an unexpected disaster, setting her on her journey of heroism.",
                R.drawable.poster_supergirl
        ))

        tvShows.add(TvShowEntity(6,
                "Shameless",
                "2004",
                "Comedy, Drama",
                "1h",
                76,
                "The story of a young group of siblings pretty much abandoned by their parents, surviving by their wits - and humor - on a rough Manchester council estate. Whilst they won't admit it, they need help and find it in Steve, a young middle class lad who falls for Fiona, the oldest sibling, and increasingly finds himself drawn to this unconventional and unique family. Anarchic family life seen through the eyes of an exceptionally bright fifteen year old, who struggles to come of age in the context of his belligerent father, closeted brother, psychotic sister and internet porn star neighbors.",
                R.drawable.poster_shameless
        ))

        tvShows.add(TvShowEntity(7,
                "Riverdale",
                "2017",
                "Drama, Mystery",
                "45m",
                80,
                "Set in the present, the series offers a bold, subversive take on Archie, Betty, Veronica and their friends, exploring the surreality of real small-town life, the darkness and weirdness bubbling beneath Riverdale’s wholesome facade.",
                R.drawable.poster_riverdale
        ))

        tvShows.add(TvShowEntity(8,
                "NCIS",
                "2003",
                "Crime, Action & Adventure, Drama",
                "45m",
                72,
                "From murder and espionage to terrorism and stolen submarines, a team of special agents investigates any crime that has a shred of evidence connected to Navy and Marine Corps personnel, regardless of rank or position.",
                R.drawable.poster_ncis
        ))

        tvShows.add(TvShowEntity(9,
                "Naruto Shippūden",
                "2007",
                "Animation, Action & Adventure, Sci-Fi & Fantasy",
                "25m",
                86,
                "Naruto Shippuuden is the continuation of the original animated TV series Naruto.The story revolves around an older and slightly more matured Uzumaki Naruto and his quest to save his friend Uchiha Sasuke from the grips of the snake-like Shinobi, Orochimaru. After 2 and a half years Naruto finally returns to his village of Konoha, and sets about putting his ambitions to work, though it will not be easy, as He has amassed a few (more dangerous) enemies, in the likes of the shinobi organization; Akatsuki.",
                R.drawable.poster_naruto_shipudden
        ))

        tvShows.add(TvShowEntity(10,
                "Marvel's Iron Fist",
                "2017",
                "Action & Adventure, Drama, Sci-Fi & Fantasy",
                "55m",
                65,
                "Danny Rand resurfaces 15 years after being presumed dead. Now, with the power of the Iron Fist, he seeks to reclaim his past and fulfill his destiny.",
                R.drawable.poster_iron_fist
        ))

        tvShows.add(TvShowEntity(11,
                "Hanna",
                "2019",
                "Action & Adventure, Drama",
                "50m",
                74,
                "This thriller and coming-of-age drama follows the journey of an extraordinary young girl as she evades the relentless pursuit of an off-book CIA agent and tries to unearth the truth behind who she is. Based on the 2011 Joe Wright film.",
                R.drawable.poster_hanna
        ))

        tvShows.add(TvShowEntity(12,
                "Grey's Anatomy",
                "2005",
                "Drama",
                "43m",
                81,
                "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.",
                R.drawable.poster_grey_anatomy
        ))

        tvShows.add(TvShowEntity(13,
                "Gotham",
                "2014",
                "Drama, Fantasy, Crime",
                "43m",
                75,
                "Everyone knows the name Commissioner Gordon. He is one of the crime world's greatest foes, a man whose reputation is synonymous with law and order. But what is known of Gordon's story and his rise from rookie detective to Police Commissioner? What did it take to navigate the multiple layers of corruption that secretly ruled Gotham City, the spawning ground of the world's most iconic villains? And what circumstances created them – the larger-than-life personas who would become Catwoman, The Penguin, The Riddler, Two-Face and The Joker?",
                R.drawable.poster_gotham
        ))

        tvShows.add(TvShowEntity(14,
                "Game of Thrones",
                "2011",
                "Sci-Fi & Fantasy, Drama, Action & Adventure, Mystery",
                "1h",
                84,
                "Seven noble families fight for control of the mythical land of Westeros. Friction between the houses leads to full-scale war. All while a very ancient evil awakens in the farthest north. Amidst the war, a neglected military order of misfits, the Night's Watch, is all that stands between the realms of men and icy horrors beyond.",
                R.drawable.poster_god
        ))

        tvShows.add(TvShowEntity(15,
                "The Flash",
                "2014",
                "Drama, Sci-Fi & Fantasy",
                "44m",
                76,
                "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
                R.drawable.poster_flash
        ))

        tvShows.add(TvShowEntity(16,
                "Family Guy",
                "1999",
                "Animation, Comedy",
                "22m",
                69,
                "Sick, twisted, politically incorrect and Freakin' Sweet animated series featuring the adventures of the dysfunctional Griffin family. Bumbling Peter and long-suffering Lois have three kids. Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), Meg (the oldest, and is the most unpopular girl in town) and Chris (the middle kid, he's not very bright but has a passion for movies). The final member of the family is Brian - a talking dog and much more than a pet, he keeps Stewie in check whilst sipping Martinis and sorting through his own life issues.",
                R.drawable.poster_family_guy
        ))

        tvShows.add(TvShowEntity(17,
                "Fairy Tail",
                "2009",
                "Action & Adventure, Animation, Comedy, Sci-Fi & Fantasy",
                "25m",
                76,
                "Lucy is a 17-year-old girl, who wants to be a full-fledged mage. One day when visiting Harujion Town, she meets Natsu, a young man who gets sick easily by any type of transportation. But Natsu isn't just any ordinary kid, he's a member of one of the world's most infamous mage guilds: Fairy Tail.",
                R.drawable.poster_fairytail
        ))

        tvShows.add(TvShowEntity(18,
                "Dragon Ball",
                "1989",
                "Comedy, Sci-Fi & Fantasy, Animation, Action & Adventure",
                "25m",
                80,
                "Long ago in the mountains, a fighting master known as Gohan discovered a strange boy whom he named Goku. Gohan raised him and trained Goku in martial arts until he died. The young and very strong boy was on his own, but easily managed. Then one day, Goku met a teenage girl named Bulma, whose search for the mystical Dragon Balls brought her to Goku's home. Together, they set off to find all seven and to grant her wish.",
                R.drawable.poster_dragon_ball
        ))
        tvShows.add(TvShowEntity(19,
                "Doom Patrol",
                "2019",
                "Sci-Fi & Fantasy, Action & Adventure, Comedy",
                "49m",
                76,
                "The Doom Patrol’s members each suffered horrible accidents that gave them superhuman abilities — but also left them scarred and disfigured. Traumatized and downtrodden, the team found purpose through The Chief, who brought them together to investigate the weirdest phenomena in existence — and to protect Earth from what they find.",
                R.drawable.poster_doom_patrol
        ))

        tvShows.add(TvShowEntity(20,
                "Arrow",
                "2012",
                "Crime, Drama, Mystery, Action & Adventure",
                "42m",
                65,
                "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
                R.drawable.poster_arrow
        ))
        return tvShows
    }
}