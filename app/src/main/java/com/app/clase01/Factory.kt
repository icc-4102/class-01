package com.app.clase01

import java.math.RoundingMode
import java.text.DecimalFormat
import kotlin.random.Random


//Las categorias se pueden crear asi o por la clase Enum
val homeCategory = HomeCategory()
val electronicCategory = ElectronicCategory()


//Metodo para crear productos segun lo cargado
fun productFactory(number: Int):List<Product> {
    val products = mutableListOf<Product>()
    for(i in 0..number) {
        val price = roundOffDecimal(Random.nextDouble(from = 10.0,until = 1000.00))
        val product = Product(price ?:0.0,productsNames.shuffled().first(),ProductCategories.values().toList().shuffled().first())
        products.add(product)
    }
    return products
}
//Metodo para crear un cliente
fun clientFactory(): Client {
    val fullName = fullNames.shuffled().first()
    return Client(fullName.substringBefore(' '), fullName.substringAfter(' '), passwords.shuffled().first())
}
//Metodo para crear un empleado
fun employeeFactory(store: Store): Employee {
    return Employee(fullNames.shuffled().first(),store.id)
}

//Metodo para que no sean precios con mas de dos decimales
internal fun roundOffDecimal(number: Double): Double {
    val df = DecimalFormat("#.##")
    df.roundingMode = RoundingMode.FLOOR
    return df.format(number).toDouble()
}

internal val productsNames = listOf("Ring Shower","Allergies Floppy Disk","Running Ice cream cone","Towel Body","Comics Puppy","Toolbox Android","Male Comics","Breakfast Shoe","Crab Clock","Video games Plus","Breakfast Toilet","Soap Flowers","Towel Leash","BBQ Monster","Urine Rollers","Bird Bird","Monster System","System Settings","Book Allergies","Water Trees","Prints Leash","Post office Laptop","Prints Body","Body Shoes","Comics YouTube","Website Sink","Floppy Disk Male","Fence Shelf","Whale Fence","Drugs Shoe","Urine Android","Toilet Urine","Urine YouTube","Cat Solar","System Plus","Nuclear Printer","Video games Horse","Shoes Bird","Male BBQ","Websites Cat","System Running","Ice cream Ice cream cone","Monster Whale","Urine System","Shoe Robot","Book Shower","Allergies Fusion","Ring Video games","Comics Shoes","Plus Monster","Book Shelf","Comics Crab","Websites Cat","Leash Leash","Book Ice cream","Book Floppy Disk","Flowers Trees","Trees Robot","Male Whale","Shoes Clock","Horse Towel","System Laptop","Urine Fusion","Soda Shower","Toolbox Book","Cone Plants","YouTube YouTube","Solar Mail","Towel Crab","Male Shelf","Toilet Shoe","Shoe Clock","Rollers Toolbox","Horse Male","Nuclear Cone","Light saber Website","Ice cream cone Ring","BBQ Shoe","Ring Shoes","Dog Cone","Cone Ring","Shoe YouTube","Ice cream cone Body","Shoes Website","Trees Boat","Settings Websites","Post office Prints","Light saber Prints","Monster Dog","Cone Leash","Dislike Ring","Soda Prints","Cat Prints","Android Plus","Dislike Soap","Soda Flowers","Prints Fence","Settings Allergies","Light saber Robot")
internal val fullNames = listOf("Russ Norbert","Diego Gannon","Sven Euen","Oakley Kurtis","Jagger Sebastien","Danny Branden","Darius Jack","Darius Coby","Loki Kale","Brendan Beau","Todd Nestor","Ace Ciaran","Tobin Fred","Tito Corbin","Clifford Virgil","Brooks Cory","Shadrach Grady","Gil Olaf","Kobe Winston","Kurtis Felix","Brenton Duane","Prakash Beck","Deon Germain","Emerson Ismael","Mikey Colm","Nash Claude","Terrance Rodolfo","Jenson Charley","Timmy Bartholomew","Andy Irvin","Raylan Anson","Wiley Arthur","Reid Jaxson","Galen Stone","Slade Devyn","Louis Elton","Denny Harry","Ivor Merick","Kenny Dennis","Humberto Jovan","Billy Apollo","Ahmad Isaias","Colm Isidore","Nihal Baylor","Van Grey","Weston Hayes","Kaiden Stacey","Doyle Farley","Easton Herbert","Dudley Leslie","Oliver Deandre","Cuthbert Westin","Dev Eustace","Lane Elias","Jake Wilfred","Raiden Kim","Wilhelm Mason","Valentino Caden","Edward Stacy","Billy Alain","Faisal Robert","Cason Justice","Shaun Lou","Corbin Sherwin","Ignacio Evangelos","Gabe Malachi","Shea Joel","Edmund Vikram","Emanuel Finley","Isiah Tyler","Tyrone Erik","Barclay Roscoe","Elmer Tiger","Lebron Ulrich","Raymond Braeden","Tucker Ethan","Issac Murphy","Westin Fernando","Humberto Lochlan","Yestin Dale","Jaylon Alfie","Rock Emil","Armando Luke","Dara Mick","Reese Kade","Magnus Rob","Ronnie Orlando","Jeremiah Kaylen","Zak Malcolm","Brayan Raheem","Shiloh Tyson","Lucas Octavio","Ennio Valentine","Zaine Anderson","Jak Lane","Maxim Camden","Ricky Larry","Colt Lisandro","Colm Jock","Prince Paul")
internal val passwords = listOf("Goombah_Filibuster","Bloviate_Namby-pamby","Sialoquent_Unremacadamized","Gazump_Anencephalous","Hoosegow_Flummox","Gardyloo!_Hoosegow","Gongoozle_Lickspittle","Donnybrook_Donnybrook","Fartlek_Collop","Snollygoster_Pandiculation","Lollygag_Ranivorous","Hobbledehoy_Gardyloo!","Goombah_Mollycoddle","Gaberlunzie_Smellfungus","Pratfall_Callipygian","Rambunctious_Rambunctious","Fartlek_Batrachomyomachy","Billingsgate_Furbelow","Gobbledygook_Doozy","Cockalorum_Lagopodous","Furbelow_Hocus-pocus","Mugwump_Slangwhanger","Ranivorous_Ornery","Pettifogger_Snollygoster","Formication_Formication","Jackanapes_Borborygm","Canoodle_Billingsgate","Argle-bargle_Flibbertigibbet","Snool_Rigmarole","Gazump_Flibbertigibbet","Mugwump_Wabbit","Kerfuffle_Absquatulate","Argle-bargle_Anencephalous","Vomitory_Fuddy-duddy","Malarkey_Panjandrum","Bowyang_Folderol","Lickspittle_Codswallop","Fuddy-duddy_Namby-pamby","Slangwhanger_Brouhaha","Fartlek_Mollycoddle","Oocephalus_Folderol","Gastromancy_Folderol","Panjandrum_Hemidemisemiquaver","Smellfungus_Snool","Gaberlunzie_Cockalorum","Formication_Fartlek","Argle-bargle_Goombah","Pandiculation_Hoosegow","Gastromancy_Hocus-pocus","Nincompoop_Donnybrook","Logorrhea_Skullduggery","Bowyang_Collop","Panjandrum_Nincompoop","Ecdysiast_Malarkey","Wabbit_Lickspittle","Filibuster_Mugwump","Ecdysiast_Comeuppance","Snollygoster_Turdiform","Furbelow_Furbelow","Callipygian_Panjandrum","Maverick_Klutz","Klutz_Catercornered","Skullduggery_Bowyang","Logorrhea_Lollygag","Lickspittle_Skullduggery","Canoodle_Hoosegow","Formication_Batrachomyomachy","Lollygag_Formication","Flibbertigibbet_Collop","Troglodyte_Ornery","La-di-da_Maverick","Furphy_Gobemouche","Discombobulate_Quean","Namby-pamby_Vomitory","Cockalorum_Quean","Maverick_Flibbertigibbet","Snickersnee_Hemidemisemiquaver","Mollycoddle_Wabbit","Rigmarole_Discombobulate","Batrachomyomachy_Ornery","Boustrophedon_Ranivorous","Crapulence_Fartlek","Hoosegow_Fard","Rigmarole_Gaberlunzie","Doozy_Tatterdemalion","Jackanapes_Rigmarole","Canoodle_Billingsgate","Flibbertigibbet_Discombobulate","Discombobulate_Abibliophobia","Hoosegow_Nincompoop","Gardyloo!_Crapulence","Bowyang_Gastromancy","Kerfuffle_Crapulence","Smellfungus_Lickety-split","Folderol_Unremacadamized","Fatuous_Comeuppance","Logorrhea_Mollycoddle","Rigmarole_Pandiculation","Billingsgate_Unremacadamized","Blunderbuss_Crudivore")