package com.zas.nfs.inventory

import com.zas.nfs.inventory.form.CarDetails
import com.zas.nfs.inventory.form.CarMake
import com.zas.nfs.inventory.form.Make

class CarListService {
    fun getCarsList(scope: Scope, data: Any? = null): ArrayList<CarDetails> {
        val carList = arrayListOf<CarDetails>()
        when (scope) {
            Scope.ALL -> {
                getCarMakes().forEach {
                    carList.addAll(getCarsList(Scope.BY_MAKE, it.make))
                }
            }
            Scope.OWNED -> {}
            Scope.IN_PROGRESS -> {}
            Scope.NEW -> {}
            Scope.BY_MAKE -> {
                if (data is Make) {
                    when (data) {
                        Make.ALFA_ROMEO -> {
                            carList.add(CarDetails(CarMake(data), "8C", "", 0))
                            carList.add(CarDetails(CarMake(data), "Giulia Quadrifoglio", "", 0))
                        }
                        Make.APOLLO -> {
                            carList.add(CarDetails(CarMake(data), "Intensa Emozione", "", 0))

                        }
                        Make.ASTON_MARTIN -> {}
                        Make.BECK_KUSTOMS -> {
                            carList.add(CarDetails(CarMake(data), "F132", "", 0))

                        }
                        Make.BENTLEY -> {}
                        Make.BMW -> {
                            carList.add(CarDetails(CarMake(data), "M2", "Coupe", 0))
                            carList.add(CarDetails(CarMake(data), "M3", "Coupe", 1999))
                            carList.add(CarDetails(CarMake(data), "M3", "GTR", 0))
                            carList.add(CarDetails(CarMake(data), "M4", "", 0))

                        }
                        Make.BRABHAM -> {}
                        Make.BUGATTI -> {
                            carList.add(CarDetails(CarMake(data), "EB110", "Super Sport", 0))

                        }
                        Make.BUICK -> {}
                        Make.CADILLAC -> {}
                        Make.CHEVROLET -> {
                            carList.add(CarDetails(CarMake(data), "Camaro", "SS", 1967))
                            carList.add(CarDetails(CarMake(data), "Camaro", "Z/28", 0))
                            carList.add(CarDetails(CarMake(data), "Corvette Stingray", "(C8)", 0))
                            carList.add(CarDetails(CarMake(data), "Corvette", "C8 Z06", 0))

                        }
                        Make.DELOREAN -> {}
                        Make.DODGE -> {
                            carList.add(CarDetails(CarMake(data), "Charger", "R/T", 0))
                            carList.add(CarDetails(CarMake(data), "Charger", "SRT Hellcat", 0))
                            carList.add(CarDetails(CarMake(data), "Challenger", "SRT8 (Snoop)", 0))
                            carList.add(CarDetails(CarMake(data), "Challenger", "SRT8", 0))

                        }
                        Make.FERRARI -> {
                            carList.add(CarDetails(CarMake(data), "Roma", "", 0))

                        }
                        Make.FORD -> {
                            carList.add(CarDetails(CarMake(data), "Fiesta", "ST", 0))
                            carList.add(CarDetails(CarMake(data), "Falcon", "XB Coupe", 0))
                            carList.add(CarDetails(CarMake(data), "GT", "", 2006))
                            carList.add(CarDetails(CarMake(data), "Model 18", "", 0))
                            carList.add(CarDetails(CarMake(data), "Mustang", "Boss 302", 0))
                            carList.add(CarDetails(CarMake(data), "Mustang", "(Hoonicorn)", 0))
                            carList.add(CarDetails(CarMake(data), "Mustang", "GT", 0))
                            carList.add(CarDetails(CarMake(data), "Shelby", "GT500", 2013))

                        }
                        Make.HENNESSEY -> {
                            carList.add(CarDetails(CarMake(data), "Exorcist Camaro", "ZL1", 0))

                        }
                        Make.HONDA -> {
                            carList.add(CarDetails(CarMake(data), "S2000", "", 0))
                            carList.add(CarDetails(CarMake(data), "CR-X", "SiR", 0))
                            carList.add(CarDetails(CarMake(data), "Civic", "Type R", 0))
                        }
                        Make.HOT_WHEELS -> {}
                        Make.INFINITI -> {}
                        Make.JAGUAR -> {}
                        Make.KOENIGSEGG -> {
                            carList.add(CarDetails(CarMake(data), "CCX", "", 0))
                            carList.add(CarDetails(CarMake(data), "Jesko", "", 0))

                        }
                        Make.KTM -> {}
                        Make.LAMBORGHINI -> {}
                        Make.LAND_ROVER -> {}
                        Make.LOTUS -> {}
                        Make.MASERATI -> {}
                        Make.MAZDA -> {
                            carList.add(CarDetails(CarMake(data), "RX-7", "FD", 0))

                        }
                        Make.MCLAREN -> {
                            carList.add(CarDetails(CarMake(data), "650S", "", 0))
                            carList.add(CarDetails(CarMake(data), "720S", "", 0))
                            carList.add(CarDetails(CarMake(data), "Speedtail", "", 0))

                        }
                        Make.MERCEDES_BENZ -> {}
                        Make.MERCEDES_AMG -> {
                            carList.add(CarDetails(CarMake(data), "GT", "", 0))
                            carList.add(CarDetails(CarMake(data), "GT", "Black Series", 0))

                        }
                        Make.MITSUBISHI -> {
                            carList.add(CarDetails(CarMake(data), "Lancer", "Evo VI", 0))

                        }
                        Make.NISSAN -> {
                            carList.add(CarDetails(CarMake(data), "180SX", "Type X", 0))
                            carList.add(CarDetails(CarMake(data), "370Z", "", 0))
                            carList.add(CarDetails(CarMake(data), "Fairlady", "240ZG", 0))
                            carList.add(CarDetails(CarMake(data), "Silvia", "Spec R", 0))
                            carList.add(CarDetails(CarMake(data), "Skyline", "GT-R", 2000))
                            carList.add(CarDetails(CarMake(data), "Skyline", "GT-R BNR32", 0))
                            carList.add(CarDetails(CarMake(data), "Skyline", "GT-R BNR34", 0))
                            carList.add(CarDetails(CarMake(data), "GT-R", "R35", 0))

                        }
                        Make.PAGANI -> {
                            carList.add(CarDetails(CarMake(data), "Huayra", "", 0))

                        }
                        Make.POLESTAR -> {}
                        Make.PONTIAC -> {
                            carList.add(CarDetails(CarMake(data), "Firebird", "", 0))
                        }
                        Make.PORSCHE -> {
                            carList.add(CarDetails(CarMake(data), "911 Carrera", "(991)", 0))
                            carList.add(CarDetails(CarMake(data), "911 Carrera", "(993)", 0))
                            carList.add(CarDetails(CarMake(data), "911 GT3", "RS (991)", 0))
                            carList.add(CarDetails(CarMake(data), "Cayenne", "Turbo GT", 0))

                        }
                        Make.RENAULT -> {}
                        Make.RIMAC -> {}
                        Make.SHELBY -> {}
                        Make.SRT -> {
                            carList.add(CarDetails(CarMake(data), "Viper", "GTS", 0))

                        }
                        Make.SUBARU -> {
                            carList.add(CarDetails(CarMake(data), "BRZ", "", 0))
                            carList.add(CarDetails(CarMake(data), "Impreza", "WRX STI", 0))

                        }
                        Make.TOYOTA -> {
                            carList.add(CarDetails(CarMake(data), "86", "", 0))
                            carList.add(CarDetails(CarMake(data), "AE86", "Trueno", 0))
                            carList.add(CarDetails(CarMake(data), "Supra", "", 0))

                        }
                        Make.VOLKSWAGEN -> {
                            carList.add(CarDetails(CarMake(data), "Golf", "GTI", 0))

                        }
                    }
                }
            }
        }
        
        return carList
    }

    fun getCarMakes(): ArrayList<CarMake> {
        val carMakes = arrayListOf<CarMake>()
        carMakes.add(CarMake(Make.ALFA_ROMEO))//ALFA ROMEO"),
        carMakes.add(CarMake(Make.APOLLO))//APOLLO"),
        carMakes.add(CarMake(Make.ASTON_MARTIN))//ASTON MARTIN"),
        carMakes.add(CarMake(Make.BECK_KUSTOMS))//BECK KUSTOMS"),
        carMakes.add(CarMake(Make.BENTLEY))//BENTLEY"),
        carMakes.add(CarMake(Make.BMW))//BMW"),
        carMakes.add(CarMake(Make.BRABHAM))//BRABHAM"),
        carMakes.add(CarMake(Make.BUGATTI))//BUGATTI"),
        carMakes.add(CarMake(Make.BUICK))//BUICK"),
        carMakes.add(CarMake(Make.CADILLAC))//CADILLAC"),
        carMakes.add(CarMake(Make.CHEVROLET))//CHEVROLET"),
        carMakes.add(CarMake(Make.DELOREAN))//DELOREAN"),
        carMakes.add(CarMake(Make.DODGE))//DODGE"),
        carMakes.add(CarMake(Make.FERRARI))//FERRARI"),
        carMakes.add(CarMake(Make.FORD))//FORD"),
        carMakes.add(CarMake(Make.HENNESSEY))//HENNESSEY"),
        carMakes.add(CarMake(Make.HONDA))//HONDA"),
        carMakes.add(CarMake(Make.HOT_WHEELS))//HOT WHEELS"),
        carMakes.add(CarMake(Make.INFINITI))//INFINITI"),
        carMakes.add(CarMake(Make.JAGUAR))//JAGUAR"),
        carMakes.add(CarMake(Make.KOENIGSEGG))//KOENIGSEGG"),
        carMakes.add(CarMake(Make.KTM))//KTM"),
        carMakes.add(CarMake(Make.LAMBORGHINI))//LAMBORGHINI"),
        carMakes.add(CarMake(Make.LAND_ROVER))//LAND ROVER"),
        carMakes.add(CarMake(Make.LOTUS))//LOTUS"),
        carMakes.add(CarMake(Make.MASERATI))//MASERATI"),
        carMakes.add(CarMake(Make.MAZDA))//MAZDA"),
        carMakes.add(CarMake(Make.MCLAREN))//McLAREN"),
        carMakes.add(CarMake(Make.MERCEDES_BENZ))//MERCEDES-BENZ"),
        carMakes.add(CarMake(Make.MERCEDES_AMG))//MERCEDES-AMG"),
        carMakes.add(CarMake(Make.MITSUBISHI))//MITSUBISHI"),
        carMakes.add(CarMake(Make.NISSAN))//NISSAN"),
        carMakes.add(CarMake(Make.PAGANI))//PAGANI"),
        carMakes.add(CarMake(Make.POLESTAR))//POLESTAR"),
        carMakes.add(CarMake(Make.PONTIAC))//PONTIAC"),
        carMakes.add(CarMake(Make.PORSCHE))//PORSCHE"),
        carMakes.add(CarMake(Make.RENAULT))//RENAULT"),
        carMakes.add(CarMake(Make.RIMAC))//RIMAC"),
        carMakes.add(CarMake(Make.SHELBY))//SHELBY"),
        carMakes.add(CarMake(Make.SRT))//SRT"),
        carMakes.add(CarMake(Make.SUBARU))//SUBARU"),
        carMakes.add(CarMake(Make.TOYOTA))//TOYOTA"),
        carMakes.add(CarMake(Make.VOLKSWAGEN))//VOLKSWAGEN")
        return carMakes
    }
}

enum class Scope {
    ALL, OWNED, IN_PROGRESS, NEW, BY_MAKE;
}