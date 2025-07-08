package com.vprioul.cv.feature.hobbies.domain.data

import com.google.android.gms.maps.model.LatLng
import com.vprioul.cv.core.resources.R
import com.vprioul.cv.feature.hobbies.domain.model.Travel

object TravelData {
    val travels: List<Travel> = listOf(
        Travel(
            R.string.hobbies_travel_french,
            2025,
            listOf(
                CityData("Bordeaux", LatLng(44.8378, -0.5792)),
                CityData("Lacanau", LatLng(45.0043, -1.1384)),
            )
        ),
        Travel(
            R.string.hobbies_travel_french,
            2025,
            listOf(
                CityData("Lyon", LatLng(45.7640, 4.8357)),
            )
        ),
        Travel(
            R.string.hobbies_travel_french,
            2024,
            listOf(
                CityData("La Toussiure", LatLng(45.2470, 6.2715)),
            )
        ),
        Travel(
            R.string.hobbies_travel_autria,
            2024,
            listOf(
                CityData("Prague", LatLng(50.0755, 14.4378)),
                CityData("Vienne", LatLng(48.2082, 16.3738)),
                CityData("Bratislava", LatLng(48.1486, 17.1077)),
            )
        ),
        Travel(
            R.string.hobbies_travel_switzerland,
            2024,
            listOf(
                CityData("Annecy", LatLng(45.8992, 6.1294)),
                CityData("Genève", LatLng(46.2044, 6.1432)),
            )
        ),
        Travel(
            R.string.hobbies_travel_marocco,
            2024,
            listOf(
                CityData("Casablanca", LatLng(33.5731, -7.5898)),
                CityData("Rabat", LatLng(34.0209, -6.8416)),
                CityData("Marrakech", LatLng(31.6295, -7.9811))
            )
        ),
        Travel(
            R.string.hobbies_travel_belgium,
            2023,
            listOf(
                CityData("Lille", LatLng(50.6292, 3.0573)),
                CityData("Bruxelles", LatLng(50.8503, 4.3517)),
                CityData("Mons", LatLng(50.4542, 3.9513)),
                CityData("Liège", LatLng(50.6326, 5.5797)),
                CityData("Maastricht", LatLng(50.8514, 5.6900)),
                CityData("Luxembourg", LatLng(49.6117, 6.1319)),
                CityData("Strasbourg", LatLng(48.5734, 7.7521)),
                CityData("Stuttgart", LatLng(48.7758, 9.1829)),
            )
        ),
        Travel(
            R.string.hobbies_travel_spain,
            2023,
            listOf(
                CityData("Bayonne", LatLng(43.4929, -1.4748)),
                CityData("Madrid", LatLng(40.4168, -3.7038)),
                CityData("Seville", LatLng(37.3891, -5.9845)),
                CityData("Gibraltar", LatLng(36.1408, -5.3536)),
                CityData("Faro", LatLng(37.0194, -7.9304)),
                CityData("Lagos", LatLng(37.1028, -8.6741)),
                CityData("Lisbonne", LatLng(38.7169, -9.1399)),
                CityData("Fatima", LatLng(39.6254, -8.6659)),
                CityData("Porto", LatLng(41.1579, -8.6291)),
                CityData("Valladolid", LatLng(41.6523, -4.7245)),
                CityData("Bayonne", LatLng(43.4929, -1.4748)),
            )
        ),
        Travel(
            R.string.hobbies_travel_belgium,
            2022,
            listOf(
                CityData("Strasbourg", LatLng(48.5734, 7.7521)),
            )
        ),
        Travel(
            R.string.hobbies_travel_belgium,
            2022,
            listOf(
                CityData("Lille", LatLng(50.6292, 3.0573)),
                CityData("Bruges", LatLng(51.2093, 3.2247)),
            )
        ),
        Travel(
            R.string.hobbies_travel_iceland,
            2022,
            listOf(
                CityData("Blue Lagoon", LatLng(63.8804, -22.4495)),
                CityData("Reykjavik", LatLng(64.1355, -21.8954)),
                CityData("Silfra", LatLng(64.2559, -21.1209)),
                CityData("Strokkur Geyser", LatLng(64.3136, -20.3024)),
                CityData("Gullfoss", LatLng(64.3275, -20.1218)),
                CityData("Secret Lagoon", LatLng(64.1374, -20.3094)),
                CityData("Kerið", LatLng(64.0416, -20.8851)),
                CityData("Hengill", LatLng(64.0530, -21.3000)),
                CityData("Seljalandsfoss", LatLng(63.6156, -19.9928)),
                CityData("Skógafoss", LatLng(63.5321, -19.5119)),
                CityData("Hálsanefshellir Cave", LatLng(63.4044, -19.0452)),
                CityData("Svartifoss", LatLng(64.0234, -16.9750)),
                CityData("Svinafellsjökull Glacier", LatLng(64.0167, -16.7833)),
                CityData("Jökulsárlón", LatLng(64.0485, -16.1790)),
                CityData("Vatnajökull", LatLng(64.4000, -16.8000)),
                CityData("Höfn", LatLng(64.2540, -15.2082))
            )
        ),
        Travel(
            R.string.hobbies_travel_french,
            2022,
            listOf(
                CityData("Bordeaux", LatLng(44.8378, -0.5792)),
                CityData("Lacanau", LatLng(45.0043, -1.1384)),
            )
        ),
        Travel(
            R.string.hobbies_travel_seychelles,
            2022,
            listOf(
                CityData("Mahé", LatLng(-4.6796, 55.4920)),
                CityData("La Digue", LatLng(-4.3581, 55.8281)),
                CityData("Praslin", LatLng(-4.3175, 55.7384)),
                CityData("Mahé", LatLng(-4.6796, 55.4920))
            )
        ),
        Travel(
            R.string.hobbies_travel_croatia,
            2021,
            listOf(
                CityData("Dubrovnik", LatLng(42.6507, 18.0944)),
                CityData("Split", LatLng(43.5081, 16.4402))
            )
        ),
        Travel(
            R.string.hobbies_travel_french,
            2021,
            listOf(
                CityData("Ajaccio", LatLng(41.9192, 8.7386)),
                CityData("Bonifacio", LatLng(41.3871, 9.1591)),
                CityData("Porto-Vecchio", LatLng(41.5914, 9.2796)),
                CityData("Cascade de Purcaraccia", LatLng(41.8130, 9.3033)),
                CityData("Bastia", LatLng(42.6973, 9.4509)),
                CityData("L'Île-Rousse", LatLng(42.6333, 8.9333))
            )
        ),
        Travel(
            R.string.hobbies_travel_french,
            2021,
            listOf(
                CityData("Toulouse", LatLng(43.6047, 1.4442)),
                CityData("Station Ski le Mourtis", LatLng(42.8885, 0.6985)),
                CityData("Andorre", LatLng(42.5078, 1.5211)),
            )
        ),
        Travel(
            R.string.hobbies_travel_reunion,
            2020,
            listOf(
                CityData("Saint Denis", LatLng(-20.8789, 55.4481)),
                CityData("Saint Paul", LatLng(-21.0095, 55.2664)),
                CityData("Saint Leu", LatLng(-21.1733, 55.2879)),
                CityData("Grand Bénare", LatLng(-21.0822, 55.4058)),
                CityData("Saint Pierre", LatLng(-21.3393, 55.4781)),
                CityData("Grand Bassin", LatLng(-21.2187, 55.5195)),
                CityData("Saint Joseph", LatLng(-21.3788, 55.6162)),
                CityData("Cascade Grand Galet", LatLng(-21.3211, 55.6456)),
                CityData("Piton de la Fournaise", LatLng(-21.2449, 55.7089)),
                CityData("Saint Philippe", LatLng(-21.3784, 55.7685)),
                CityData("Route des Laves", LatLng(-21.2637, 55.7857)),
                CityData("Anse des Cascades", LatLng(-21.2069, 55.8325)),
                CityData("Notre Dame des Laves", LatLng(-21.1950, 55.8269)),
                CityData("Saint André", LatLng(-20.9634, 55.6506)),
                CityData("Saint Denis", LatLng(-20.8789, 55.4481))
            )
        ),
        Travel(
            R.string.hobbies_travel_french,
            2020,
            listOf(
                CityData("Toulouse", LatLng(43.6047, 1.4442)),
                CityData("Station Ski le Mourtis", LatLng(42.8885, 0.6985)),
                CityData("Andorre", LatLng(42.5078, 1.5211)),
            )
        ),
        Travel(
            R.string.hobbies_travel_thailand,
            2019,
            listOf(
                CityData("Bangkok", LatLng(13.7563, 100.5018)),
                CityData("Klong Yai", LatLng(11.7789, 102.9210)),
                CityData("Koh Chang", LatLng(12.0516, 102.3225)),
                CityData("Siem Reap", LatLng(13.3671, 103.8448)),
                CityData("Kampong Cham", LatLng(11.9934, 105.4630)),
                CityData("Phnom Penh", LatLng(11.5564, 104.9282)),
                CityData("Phuket", LatLng(7.8804, 98.3923)),
                CityData("Chiang Mai", LatLng(18.7061, 98.9817)),
                CityData("Parc national Erawan", LatLng(14.3233, 99.1306)),
                CityData("Bangkok", LatLng(13.7563, 100.5018))
            )
        ),
        Travel(
            R.string.hobbies_travel_nederland,
            2019,
            listOf(
                CityData("Amsterdam", LatLng(52.3676, 4.9041))
            )
        ),
        Travel(
            R.string.hobbies_travel_french,
            2018,
            listOf(
                CityData("Alpe Huez", LatLng(45.0909, 6.0709))
            )
        ),
        Travel(
            R.string.hobbies_travel_italia,
            2018,
            listOf(
                CityData("Palerme", LatLng(38.1157, 13.3615)),
                CityData("Scala dei Turchi", LatLng(37.2921, 13.4709)),
                CityData("Etna", LatLng(37.7510, 14.9934)),
                CityData("Syracuse", LatLng(37.0755, 15.2866)),
                CityData("Catane", LatLng(37.5079, 15.0830)),
                CityData("Rome", LatLng(41.9028, 12.4964)),
                CityData("Vatican", LatLng(41.9029, 12.4534))
            )
        ),
        Travel(
            R.string.hobbies_travel_hungary,
            2018,
            listOf(
                CityData("Budapest", LatLng(47.4979, 19.0402))
            )
        ),
        Travel(
            R.string.hobbies_travel_french,
            2018,
            listOf(
                CityData("La Joue de Loup", LatLng(44.6906, 5.8883))
            )
        ),
        Travel(
            R.string.hobbies_travel_malaisian,
            2017,
            listOf(
                CityData("Kuala Lumpur", LatLng(3.1390, 101.6869)),
                CityData("Cameron Highlands", LatLng(4.4711, 101.3769)),
                CityData("Taman Negara", LatLng(4.6973, 102.1430)),
                CityData("Perhentian Island", LatLng(5.9167, 102.7333)),
                CityData("Tioman Island", LatLng(2.8176, 104.1698)),
                CityData("Singapour", LatLng(1.3521, 103.8198)),
                CityData("Kuala Lumpur", LatLng(3.1390, 101.6869))
            )
        ),
        Travel(
            R.string.hobbies_travel_malta,
            2016,
            listOf(
                CityData("La Valette", LatLng(35.8997, 14.5146)),
                CityData("Comino", LatLng(36.0158, 14.3353)),
                CityData("Ix Xaghra", LatLng(36.0531, 14.2640))
            )
        ),
        Travel(
            R.string.hobbies_travel_spain,
            2015,
            listOf(
                CityData("Barcelone", LatLng(41.3851, 2.1734))
            )
        ),
        Travel(
            R.string.hobbies_travel_england,
            2014,
            listOf(
                CityData("Londres", LatLng(51.5074, -0.1278))
            )
        ),
        Travel(
            R.string.hobbies_travel_portugal,
            2014,
            listOf(
                CityData("Faro", LatLng(37.0194, -7.9304)),
                CityData("Lagos", LatLng(37.1028, -8.6742))
            )
        ),
        Travel(
            R.string.hobbies_travel_sweden,
            2007,
            listOf(
                CityData("Goteborg", LatLng(57.7089, 11.9746))
            )
        ),
        Travel(
            R.string.hobbies_travel_french,
            2006,
            listOf(
                CityData("Combourg-Megève", LatLng(45.8570, 6.6170))
            )
        ),
        Travel(
            R.string.hobbies_travel_french,
            2005,
            listOf(
                CityData("Combourg-Megève", LatLng(45.8570, 6.6170))
            )
        ),
        Travel(
            R.string.hobbies_travel_italia,
            2003,
            listOf(
                CityData("Turin", LatLng(45.0703, 7.6869)),
                CityData("Genes", LatLng(44.4056, 8.9463)),
                CityData("Pise", LatLng(43.7160, 10.3966))
            )
        ),
        Travel(
            R.string.hobbies_travel_nederland,
            2002,
            listOf(
                CityData("Eindhoven", LatLng(51.4416, 5.4697))
            )
        ),
        Travel(
            R.string.hobbies_travel_usa,
            2001,
            listOf(
                CityData("New York City", LatLng(40.7128, -74.0060)),
                CityData("New Jersey", LatLng(40.0583, -74.4057)),
                CityData("Atlanta", LatLng(33.7490, -84.3880)),
                CityData("Orlando", LatLng(28.5383, -81.3792)),
                CityData("Miami", LatLng(25.7617, -80.1918)),
                CityData("Key West", LatLng(24.5551, -81.7800))
            )
        ),
        Travel(
            R.string.hobbies_travel_guadeloupe,
            1999,
            listOf(
                CityData("Guadeloupe", LatLng(16.2650, -61.5510))
            )
        ),
        Travel(
            R.string.hobbies_travel_england,
            1998,
            listOf(
                CityData("Jersey", LatLng(49.2144, -2.1313))
            )
        ),
        Travel(
            R.string.hobbies_travel_french,
            1997,
            listOf(
                CityData("Valloire", LatLng(45.1659, 6.4289))
            )
        ),
        Travel(
            R.string.hobbies_travel_martinique,
            1996,
            listOf(
                CityData("Martinique", LatLng(14.6415, -61.0242))
            )
        ),
        Travel(
            R.string.hobbies_travel_french,
            1995,
            listOf(
                CityData("Valloire", LatLng(45.1659, 6.4289))
            )
        )
    )
}
