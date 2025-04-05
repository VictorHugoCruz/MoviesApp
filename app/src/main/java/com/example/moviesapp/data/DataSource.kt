package com.example.moviesapp.data

import kotlin.collections.listOf
import com.example.moviesapp.R

object DataSource{
    val movies = listOf(
        Movie(
            title = "The Godfather",
            genre = listOf<Genre>(Genre(GenreMovie.DRAMA)),
            rating = 9.2,
            director = listOf(Director("Francis Ford Coppola")),
            actors = listOf("Marlon Brando", "Al Pacino", "James Caan"),
            synopsis = "The epic saga of the Corleone family and their rise to power in the mafia.",
            imageUrl = R.drawable.el_padrino
        ),
        Movie(
            title = "The Shawshank Redemption",
            genre = listOf<Genre>(Genre(GenreMovie.DRAMA)),
            rating = 9.3,
            director = listOf(Director("Frank Darabont")),
            actors = listOf("Tim Robbins", "Morgan Freeman", "Bob Gunton"),
            synopsis = "The story of an unjustly imprisoned banker and his friendship with a fellow inmate.",
            imageUrl = R.drawable.the_shaw_shank
        ),
        Movie(
            title = "The Dark Knight",
            genre = listOf<Genre>(Genre(GenreMovie.ACTION)),
            rating = 9.0,
            director = listOf(Director("Christopher Nolan")),
            actors = listOf("Christian Bale", "Heath Ledger", "Aaron Eckhart"),
            synopsis = "Batman faces the chaos unleashed by the Joker in Gotham City.",
            imageUrl = R.drawable.the_dark_knight
        ),
        Movie(
            title = "Schindler's List",
            genre = listOf<Genre>(Genre(GenreMovie.DRAMA)),
            rating = 8.9,
            director = listOf(Director("Steven Spielberg")),
            actors = listOf("Liam Neeson", "Ralph Fiennes", "Ben Kingsley"),
            synopsis = "The true story of Oskar Schindler, a German businessman who saved the lives of Jews during the Holocaust.",
            imageUrl = R.drawable.schindlers_list
        ),
        Movie(
            title = "The Lord of the Rings: The Return of the King",
            genre = listOf<Genre>(Genre(GenreMovie.FANTASY)),
            rating = 8.9,
            director = listOf(Director("Peter Jackson")),
            actors = listOf("Elijah Wood", "Ian McKellen", "Viggo Mortensen"),
            synopsis = "The epic conclusion of The Lord of the Rings trilogy.",
            imageUrl = R.drawable.the_lord_of_the_kings
        ),
        Movie(
            title = "Pulp Fiction",
            genre = listOf<Genre>(Genre(GenreMovie.CRIME)),
            rating = 8.9,
            director = listOf(Director("Quentin Tarantino")),
            actors = listOf("John Travolta", "Uma Thurman", "Samuel L. Jackson"),
            synopsis = "Intertwined stories of crime and redemption in Los Angeles.",
            imageUrl = R.drawable.pulp_fiction
        ),
        Movie(
            title = "The Good, the Bad and the Ugly",
            genre = listOf<Genre>(Genre(GenreMovie.WESTERN)),
            rating = 8.8,
            director = listOf(Director("Sergio Leone")),
            actors = listOf("Clint Eastwood", "Lee Van Cleef", "Eli Wallach"),
            synopsis = "Three gunmen search for hidden treasure during the American Civil War.",
            imageUrl = R.drawable.the_good_the_bad_and_the_ugly
        ),
        Movie(
            title = "12 Angry Men",
            genre = listOf<Genre>(Genre(GenreMovie.DRAMA)),
            rating = 8.9,
            director = listOf(Director("Sidney Lumet")),
            actors = listOf("Henry Fonda", "Lee J. Cobb", "E.G. Marshall"),
            synopsis = "A jury deliberates on the fate of a young man accused of murder.",
            imageUrl = R.drawable.twelv_angry_men
        ),
        Movie(
            title = "Fight Club",
            genre = listOf<Genre>(Genre(GenreMovie.DRAMA)),
            rating = 8.8,
            director = listOf(Director("David Fincher")),
            actors = listOf("Edward Norton", "Brad Pitt", "Helena Bonham Carter"),
            synopsis = "An insomniac office worker and a soap salesman form an underground fight club.",
            imageUrl = R.drawable.fight_club
        ),
        Movie(
            title = "Inception",
            genre = listOf<Genre>(Genre(GenreMovie.SCIENCE_FICTION)),
            rating = 8.8,
            director = listOf(Director("Christopher Nolan")),
            actors = listOf("Leonardo DiCaprio", "Joseph Gordon-Levitt", "Elliot Page"),
            synopsis = "A dream thief leads a team to implant an idea into the mind of a target.",
            imageUrl = R.drawable.inception
        ),
        Movie(
            title = "Interstellar",
            genre = listOf<Genre>(Genre(GenreMovie.SCIENCE_FICTION)),
            rating = 8.6,
            director = listOf(Director("Christopher Nolan")),
            actors = listOf("Matthew McConaughey", "Anne Hathaway", "Jessica Chastain"),
            synopsis = "A group of astronauts travel through a wormhole in search of a new home for humanity.",
            imageUrl = R.drawable.interstellar
        ),
        Movie(
            title = "Parasite",
            genre = listOf<Genre>(Genre(GenreMovie.THRILLER)),
            rating = 8.6,
            director = listOf(Director("Bong Joon-ho")),
            actors = listOf("Song Kang-ho", "Lee Sun-kyun", "Cho Yeo-jeong"),
            synopsis = "A poor family infiltrates the lives of a rich family.",
            imageUrl = R.drawable.parasite
        ),
        Movie(
            title = "Spirited Away",
            genre = listOf<Genre>(Genre(GenreMovie.ANIMATION)),
            rating = 8.6,
            director = listOf(Director("Hayao Miyazaki")),
            actors = listOf("Rumi Hiiragi", "Miyu Irino", "Mari Natsuki"),
            synopsis = "A young girl ventures into a magical world to save her parents.",
            imageUrl = R.drawable.spirited_away
        ),
        Movie(
            title = "The Lion King",
            genre = listOf<Genre>(Genre(GenreMovie.ANIMATION)),
            rating = 8.5,
            director = listOf(Director("Roger Allers"), Director("Rob Minkoff")),
            actors = listOf("Matthew Broderick", "Jeremy Irons", "James Earl Jones"),
            synopsis = "A young lion must claim his place as king of the savannah.",
            imageUrl = R.drawable.the_lion_king
        ),
        Movie(
            title = "Back to the Future",
            genre = listOf<Genre>(Genre(GenreMovie.SCIENCE_FICTION)),
            rating = 8.5,
            director = listOf(Director("Robert Zemeckis")),
            actors = listOf("Michael J. Fox", "Christopher Lloyd", "Lea Thompson"),
            synopsis = "A teenager travels back in time with the help of an eccentric scientist.",
            imageUrl = R.drawable.back_to_the_future
        ),
        Movie(
            title = "The Silence of the Lambs",
            genre = listOf<Genre>(Genre(GenreMovie.THRILLER)),
            rating = 8.6,
            director = listOf(Director("Jonathan Demme")),
            actors = listOf("Jodie Foster", "Anthony Hopkins", "Scott Glenn"),
            synopsis = "An FBI agent seeks the help of an imprisoned serial killer to catch another.",
            imageUrl = R.drawable.the_silence_of_the_lambs
        ),
        Movie(
            title = "Forrest Gump",
            genre = listOf<Genre>(Genre(GenreMovie.DRAMA)),
            rating = 8.8,
            director = listOf(Director("Robert Zemeckis")),
            actors = listOf("Tom Hanks", "Robin Wright", "Gary Sinise"),
            synopsis = "The story of a man with a unique perspective on life.",
            imageUrl = R.drawable.forrest_gump
        ),
        Movie(
            title = "The Grand Budapest Hotel",
            genre = listOf<Genre>(Genre(GenreMovie.COMEDY)),
            rating = 8.1,
            director = listOf(Director("Wes Anderson")),
            actors = listOf("Ralph Fiennes", "Tony Revolori", "Saoirse Ronan"),
            synopsis = "The adventures of a concierge and his protégé at a luxury hotel.",
            imageUrl = R.drawable.the_grand_budapest_hotel
        ),
        Movie(
            title = "The Pianist",
            genre = listOf<Genre>(Genre(GenreMovie.DRAMA)),
            rating = 8.5,
            director = listOf(Director("Roman Polanski")),
            actors = listOf("Adrien Brody", "Thomas Kretschmann", "Frank Finlay"),
            synopsis = "The story of a Jewish pianist who struggles to survive in Nazi-occupied Warsaw.",
            imageUrl = R.drawable.the_pianist
        ),
        Movie(
            title = "Life Is Beautiful",
            genre = listOf<Genre>(Genre(GenreMovie.DRAMA), Genre(GenreMovie.COMEDY)),
            rating = 8.6,
            director = listOf(Director("Roberto Benigni")),
            actors = listOf("Roberto Benigni", "Nicoletta Braschi", "Giorgio Cantarini"),
            synopsis = "An Italian father uses his imagination to protect his son from the horrors of the Holocaust.",
            imageUrl = R.drawable.life_is_beautiful
        ),
        Movie(
            title = "City of God",
            genre = listOf<Genre>(Genre(GenreMovie.CRIME)),
            rating = 8.6,
            director = listOf(Director("Fernando Meirelles"), Director("Kátia Lund")),
            actors = listOf("Alexandre Rodrigues", "Leandro Firmino", "Matheus Nachtergaele"),
            synopsis = "The story of two boys who grow up in a favela in Rio de Janeiro.",
            imageUrl = R.drawable.city_of_good
        ),
        Movie(
            title = "The Princess Bride",
            genre = listOf<Genre>(Genre(GenreMovie.ADVENTURE)),
            rating = 8.0,
            director = listOf(Director("Rob Reiner")),
            actors = listOf("Cary Elwes", "Robin Wright", "Mandy Patinkin"),
            synopsis = "A fairy tale full of humor, romance and adventure.",
            imageUrl = R.drawable.the_princess_bride
        ),
        Movie(
            title = "Howl's Moving Castle",
            genre = listOf<Genre>(Genre(GenreMovie.ANIMATION)),
            rating = 8.2,
            director = listOf(Director("Hayao Miyazaki")),
            actors = listOf("Chieko Baisho", "Takuya Kimura", "Akihiro Miwa"),
            synopsis = "A cursed young woman seeks the help of a wizard to break her curse.",
            imageUrl = R.drawable.howls_moving_castle
        ),
        Movie(
            title = "The Big Lebowski",
            genre = listOf<Genre>(Genre(GenreMovie.COMEDY)),
            rating = 8.1,
            director = listOf(Director("Joel Coen"), Director("Ethan Coen")),
            actors = listOf("Jeff Bridges", "John Goodman", "Julianne Moore"),
            synopsis = "An unemployed bowler gets caught up in a kidnapping case.",
            imageUrl = R.drawable.the_big_lebowski
        ),
        Movie(
            title = "The Exorcist",
            genre = listOf<Genre>(Genre(GenreMovie.HORROR)),
            rating = 8.0,
            director = listOf(Director("William Friedkin")),
            actors = listOf("Ellen Burstyn", "Max von Sydow", "Jason Miller"),
            synopsis = "A mother seeks help for her demon-possessed daughter.",
            imageUrl = R.drawable.the_exorcist
        ),
        Movie(
            title = "The Shining",
            genre = listOf<Genre>(Genre(GenreMovie.HORROR)),
            rating = 8.4,
            director = listOf(Director("Stanley Kubrick")),
            actors = listOf("Jack Nicholson", "Shelley Duvall", "Danny Lloyd"),
            synopsis = "A family isolates themselves in a haunted hotel during the winter.",
            imageUrl = R.drawable.the_shining
        ),
        Movie(
            title = "A Clockwork Orange",
            genre = listOf<Genre>(Genre(GenreMovie.SCIENCE_FICTION)),
            rating = 8.3,
            director = listOf(Director("Stanley Kubrick")),
            actors = listOf("Malcolm McDowell", "Patrick Magee", "Michael Bates"),
            synopsis = "A young delinquent undergoes experimental treatment for violence.",
            imageUrl = R.drawable.a_clockwork_orange
        ),
        Movie(
            title = "The Sixth Sense",
            genre = listOf<Genre>(Genre(GenreMovie.THRILLER)),
            rating = 8.1,
            director = listOf(Director("M. Night Shyamalan")),
            actors = listOf("Bruce Willis", "Haley Joel Osment", "Toni Collette"),
            synopsis = "A child psychologist helps a boy who can see ghosts.",
            imageUrl = R.drawable.the_sixth_sense
        ),
        Movie(
            title = "The Orphanage",
            genre = listOf<Genre>(Genre(GenreMovie.HORROR)),
            rating = 7.4,
            director = listOf(Director("J.A. Bayona")),
            actors = listOf("Belén Rueda", "Fernando Cayo", "Roger Príncep"),
            synopsis = "A mother searches for her missing son in an old orphanage.",
            imageUrl = R.drawable.the_orphanage
        ),
        Movie(
            title = "The Conjuring",
            genre = listOf<Genre>(Genre(GenreMovie.HORROR)),
            rating = 7.5,
            director = listOf(Director("James Wan")),
            actors = listOf("Vera Farmiga", "Patrick Wilson", "Ron Livingston"),
            synopsis = "A family is terrorized by an evil presence in their new home.",
            imageUrl = R.drawable.the_conjuring
        ),
        Movie(
            title = "The Witch",
            genre = listOf<Genre>(Genre(GenreMovie.HORROR)),
            rating = 6.9,
            director = listOf(Director("Robert Eggers")),
            actors = listOf("Anya Taylor-Joy", "Ralph Ineson", "Kate Dickie"),
            synopsis = "A Puritan family faces dark forces in the forest.",
            imageUrl = R.drawable.the_witch
        ),
        Movie(
            title = "Hereditary",
            genre = listOf<Genre>(Genre(GenreMovie.HORROR)),
            rating = 7.3,
            director = listOf(Director("Ari Aster")),
            actors = listOf("Toni Collette", "Alex Wolff", "Milly Shapiro"),
            synopsis = "A family faces a demonic presence after the death of their grandmother.",
            imageUrl = R.drawable.hereditary
        ),
        Movie(
            title = "The Babadook",
            genre = listOf<Genre>(Genre(GenreMovie.HORROR)),
            rating = 6.8,
            director = listOf(Director("Jennifer Kent")),
            actors = listOf("Essie Davis", "Noah Wiseman", "Daniel Henshall"),
            synopsis = "A mother and her son are terrorized by a creature from a children's book.",
            imageUrl = R.drawable.the_badadook
        ),
        Movie(
            title = "The Invitation",
            genre = listOf<Genre>(Genre(GenreMovie.HORROR)),
            rating = 6.7,
            director = listOf(Director("Karyn Kusama")),
            actors = listOf("Logan Marshall-Green", "Tammy Blanchard", "Michiel Huisman"),
            synopsis = "A man attends a dinner party with his ex-wife and new friends, but suspects something is wrong.",
            imageUrl = R.drawable.the_invitation
        ),
        Movie(
            title = "The Lighthouse",
            genre = listOf<Genre>(Genre(GenreMovie.HORROR)),
            rating = 7.4,
            director = listOf(Director("Robert Eggers")),
            actors = listOf("Willem Dafoe", "Robert Pattinson", "Valeriia Karaman"),
            synopsis = "Two lighthouse keepers face madness and supernatural forces on a remote island.",
            imageUrl = R.drawable.the_lighthouse
        ),
        Movie(
            title = "Don't Breathe",
            genre = listOf<Genre>(Genre(GenreMovie.HORROR)),
            rating = 7.1,
            director = listOf(Director("Fede Álvarez")),
            actors = listOf("Stephen Lang", "Jane Levy", "Dylan Minnette"),
            synopsis = "A group of young thieves face a blind man with a dark secret.",
            imageUrl = R.drawable.dont_breathe
        ),
        Movie(
            title = "The Blair Witch Project",
            genre = listOf<Genre>(Genre(GenreMovie.HORROR)),
            rating = 6.5,
            director =listOf(Director("Daniel Myrick"), Director("Eduardo Sánchez"))  ,
            actors = listOf("Heather Donahue", "Michael C. Williams", "Joshua Leonard"),
            synopsis = "Three film students disappear while investigating a local legend.",
            imageUrl = R.drawable.the_blair_witch_project
        ),
        Movie(
            title = "The Autopsy of Jane Doe",
            genre = listOf<Genre>(Genre(GenreMovie.HORROR)),
            rating = 6.8,
            director = listOf(Director("André Øvredal")),
            actors = listOf("Brian Cox", "Emile Hirsch", "Ophelia Lovibond"),
            synopsis = "A father and son coroner discover dark secrets while performing an autopsy.",
            imageUrl = R.drawable.the_autopsy_of_jane_doe
        ),
        Movie(
            title = "The Descent",
            genre = listOf<Genre>(Genre(GenreMovie.HORROR)),
            rating = 7.2,
            director = listOf(Director("Neil Marshall")),
            actors = listOf("Shauna Macdonald", "Natalie Mendoza", "Alex Reid"),
            synopsis = "A group of female explorers venture into a cave and face terrifying creatures.",
            imageUrl = R.drawable.the_descent
        ),
        Movie(
            title = "Crimson Peak",
            genre = listOf<Genre>(Genre(GenreMovie.HORROR)),
            rating = 6.6,
            director = listOf(Director("Guillermo del Toro")),
            actors = listOf("Mia Wasikowska", "Tom Hiddleston", "Jessica Chastain"),
            synopsis = "A young woman moves into a Gothic mansion with her new husband and discovers dark secrets.",
            imageUrl = R.drawable.cimson_peak
        ),
        Movie(
            title = "The Invisible Man",
            genre = listOf<Genre>(Genre(GenreMovie.HORROR)),
            rating = 7.1,
            director = listOf(Director("Leigh Whannell")),
            actors = listOf("Elisabeth Moss", "Aldis Hodge", "Storm Reid"),
            synopsis = "A woman escapes an abusive relationship and discovers her ex-boyfriend is stalking her.",
            imageUrl = R.drawable.the_invisible_man
        ),
        Movie(
            title = "Fear Street Part One: 1994",
            genre = listOf<Genre>(Genre(GenreMovie.HORROR)),
            rating = 6.2,
            director = listOf(Director("Leigh Janiak")),
            actors = listOf("Kiana Madeira", "Olivia Scott Welch", "Benjamin Flores Jr."),
            synopsis = "A group of teenagers discovers that the horrific events in their city are connected.",
            imageUrl = R.drawable.fear_street_part_one
        ),
        Movie(
            title = "Malignant",
            genre = listOf<Genre>(Genre(GenreMovie.HORROR)),
            rating = 6.3,
            director = listOf(Director("James Wan")),
            actors = listOf("Annabelle Wallis", "Maddie Hasson", "George Young"),
            synopsis = "A woman has terrifying visions of murders and discovers they are related to her past.",
            imageUrl = R.drawable.maligmant
        ),
        Movie(
            title = "Candyman",
            genre = listOf<Genre>(Genre(GenreMovie.HORROR)),
            rating = 6.0,
            director = listOf(Director("Nia DaCosta")),
            actors = listOf("Yahya Abdul-Mateen II", "Teyonah Parris", "Nathan Stewart-Jarrett"),
            synopsis = "An artist discovers the legend of Candyman and unleashes a wave of violence.",
            imageUrl = R.drawable.candyman
        ),
        Movie(
            title = "The Black Phone",
            genre = listOf<Genre>(Genre(GenreMovie.HORROR)),
            rating = 7.0,
            director = listOf(Director("Scott Derrickson")),
            actors = listOf("Mason Thames", "Madeleine McGraw", "Ethan Hawke"),
            synopsis = "A boy kidnapped by a serial killer receives help from calls from previous victims.",
            imageUrl = R.drawable.the_black_phone
        ),
        Movie(
            title = "Barbarian",
            genre = listOf<Genre>(Genre(GenreMovie.HORROR)),
            rating = 7.1,
            director = listOf(Director("Zach Cregger")),
            actors = listOf("Georgina Campbell", "Bill Skarsgård", "Justin Long"),
            synopsis = "A woman discovers dark secrets in the house she rents on Airbnb.",
            imageUrl = R.drawable.barbarian
        ),
        Movie(
            title = "Smile",
            genre = listOf<Genre>(Genre(GenreMovie.HORROR)),
            rating = 6.6,
            director = listOf(Director("Parker Finn")),
            actors = listOf("Sosie Bacon", "Kyle Gallner", "Jessie T. Usher"),
            synopsis = "A doctor begins to experience terrifying events after witnessing a traumatic incident.",
            imageUrl = R.drawable.smile
        ),
        Movie(
            title = "Talk to Me",
            genre = listOf<Genre>(Genre(GenreMovie.HORROR)),
            rating = 7.1,
            director = listOf(Director("Danny Philippou"), Director("Michael Philippou")) ,
            actors = listOf("Sophie Wilde", "Alexandra Jensen", "Joe Bird"),
            synopsis = "A group of friends discover an embalmed hand that allows them to contact spirits.",
            imageUrl = R.drawable.talk_to_me
        )
    )

    val horrorList = movies.filter { it.genre.contains(Genre(GenreMovie.HORROR)) }
    val dramaList = movies.filter { it.genre.contains(Genre(GenreMovie.DRAMA)) }
    val animationList = movies.filter { it.genre.contains(Genre(GenreMovie.ANIMATION)) }
    val actionList = movies.filter { it.genre.contains(Genre(GenreMovie.ACTION)) }
    val fantasyList = movies.filter { it.genre.contains(Genre(GenreMovie.FANTASY)) }
    val scienceFictionList = movies.filter { it.genre.contains(Genre(GenreMovie.SCIENCE_FICTION)) }
    val westernList = movies.filter { it.genre.contains(Genre(GenreMovie.WESTERN)) }
    val comedyList = movies.filter { it.genre.contains(Genre(GenreMovie.COMEDY)) }
    val crimeList = movies.filter { it.genre.contains(Genre(GenreMovie.CRIME)) }
    val thrillerList = movies.filter { it.genre.contains(Genre(GenreMovie.THRILLER)) }
    val adventureList = movies.filter { it.genre.contains(Genre(GenreMovie.ADVENTURE)) }

    val forYouList = movies.filter { it.rating > 8.5 }
}