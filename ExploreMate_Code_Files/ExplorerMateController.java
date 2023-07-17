package com.sabanciuniv.controller;
import java.util.List;

import javax.annotation.PostConstruct;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sabanciuniv.model.AllData;

import com.sabanciuniv.repo.DataRepository;



@RestController
@RequestMapping("/fff")
public class ExplorerMateController {
	
	
	@Autowired private DataRepository dataRepository;

	
	@PostConstruct
	public void init() {
		
		
			
			if(dataRepository.count() ==0) {	
				AllData I1 = new AllData("Italy","Trevi Fountain","This site is best viewed at night when lights illuminate the fountain. However, some travelers lament the Trevi's many tourists and aggressive local street vendors (you'll likely have a hard time getting a crowd-free photo here). The Trevi Fountain sits off the Barberini metro stop and is about a 10-minute walk east of the Pantheon. It is free to visit 24/7. If you don't plan a visit on your own, you'll likely pass by the fountain if you sign up for one of the best Rome tours.","italy_trevi");
				AllData I2 = new AllData("Italy","Piazza della Signoria","Take your time wandering around, and if you get tired, grab a seat along the Loggia dei Lanzi, or make your way to a cafe near the Fountain of Neptune. Recent visitors said this is a must-see spot and a great area to people-watch, view magnificent sculptures and rest travel-weary feet (though past travelers recommended avoiding the restaurants in this area, calling them \"outrageously overpriced\"). To avoid the height of the crowds, visit in the early morning or the evening. Access to the area is free 24/7.","italy_piazza");
				AllData I3 = new AllData("Italy","Cathedral of Santa Maria del Fiore","The Cattedrale di Santa Maria del Fiore (known simply as the Duomo) is not only Florence's religious center, but it's also the city's most recognizable attraction. Occupying the Piazza del Duomo in the heart of the city, this massive Gothic cathedral was erected during the 14th century on the former site of the Roman church, Santa Reparata. You'll know you're in the right place when you find yourself straining your neck to see the church's massive, iconic dome and the intricate marble statues on its facade staring down at you. The red-tiled cupola was designed by Brunelleschi and is described as a must-see by experts and travelers alike.","italy_cathedral");
				AllData I4 = new AllData("Italy","Grand Canal","Considered to be the main street of Venice, the roughly 2-mile Grand Canal is one of the city's most popular and highly photographed attractions. Recent travelers recommend hiring a gondolier for a romantic row along the canal. If you're hoping to do this option, plan to fork over between 80 and 120 euros (about $87 to $132) for the ride.","italy_canal");
				AllData F1 = new AllData("France","Notre-Dame Cathedral","Like the Eiffel Tower, the Notre-Dame Cathedral is seen as a Parisian icon. Located along the picturesque River Seine, the Notre-Dame Cathedral is considered a Gothic masterpiece and is often regarded as one of the best Gothic cathedrals of its kind in the world. Construction of the famous cathedral started in the late 12th century and final touches weren't made until nearly 200 years later. Once you get an eyeful of the cathedral yourself, you'll start to understand why it took so long.","france_notre");
				AllData F2 = new AllData("France","Eiffel Tower","Today, the Eiffel Tower is still used for communication but is chiefly regarded for its grandeur. If you can believe it, many Parisians initially found this architectural marvel to be nothing more than an eyesore. Regardless, the Eiffel Tower today stands as one of the most visited tourist attractions in the world. Visitors can walk up to the first floor of the Eiffel Tower or take the elevator all the way up to the top, where they'll be treated with vast panoramic views of the city. While some recent visitors complain of long lines – especially during the summer – you can bypass the wait by booking your tickets online at the Eiffel Tower's website.","france_eiffel");
				AllData F3 = new AllData("France","Musée du Louvre","f you only had time to visit one museum in Paris, it should undoubtedly be the Musée du Louvre. That's because the Louvre is not only widely considered to be one of the best art museums in Europe, but one of the best in the world. The museum first opened its doors in 1793 and features more than 35,000 works of art on display. Here, you can get up close to a variety of art from different time periods and cultures. The Louvre features everything from Egyptian mummy tombs to ancient Grecian sculptures (including the renowned Winged Victory of Samothrace and curvaceous Venus de Milo). There are also thousands of paintings to peruse as well. Masterpieces such as \"Liberty Leading the People\" by Eugene Delacroix, \"The Raft of the Medusa\" by Théodore Géricault and Leonardo da Vinci's \"Mona Lisa,\" the museum's biggest star, can be found here.","france_louvre");
				AllData F4 = new AllData("France","Musée d'Orsay","Housed in a former railway station along the Left Bank, the Musée d'Orsay is regarded for its rich collection of impressionist works. You'll see paintings by French artists like Degas, Monet, Cezanne and Van Gogh, among many, many others. The museum also houses a number of sculptures, as well as photography and even furniture displays. And if you climb to the museum's top balcony, you can catch a breathtaking view of the Sacré-Coeur Basilica through the museum's massive transparent clock.","france_orsay");
				AllData F5 = new AllData("France","Mont Saint-Michel Abbey","Surrounded by sea in the high tide and sand in low, Abbaye du Mont-Saint-Michel is one of France's most-toured sites outside of the popular Parisian landmarks. It's also a UNESCO World Heritage Site. Its first incarnation was raised on the 264-foot-high rock beginning in the 10th century, but additions were added well into the 19th century. Today, you can tour the abbey and the little village at its base, as well as several museums. Tours are offered year-round, but you can also traipse the massive structure on your own.","france_saint");
				AllData T1 = new AllData("Turkey","Blue Lagoon","This bay of turquoise water, with its finger of white sand curving around it, is so supernaturally vibrant that it has become a poster child for the Turquoise Coast. The sands of Belcekiz beach slip into the limpid shallows, creating Maldivian-esque swirling seascapes of blue and white, protected by the green-forested promontories which lie around it like sleeping dragons. Overhead, the skies are full of paragliders viewing the whole splendid shebang from the air.","turkey_lagoon");
				AllData T2 = new AllData("Turkey","The pools of Pamukkale","The mineral springs that have cascaded down the hillside for thousands of years have created this extraordinary sight – Pamukkale means ‘cotton castle’ – in Turkey’s Büyük Menderes Valley. The series of natural pools of pale eau-de-nil water, cupped in shallow, organic-shaped basins of gleaming-white travertine, are terraced into the hillside, overspilling with the mineral-rich spring water that formed them and which appears to have frozen in time in petrified waterfalls, stalactites of limestone like wedding-cake icing dripping down the hillside. The spectacle gets busy with tourists, but often overlooked are the ancient ruins of the Greco-Roman spa town Hierapolis, built at the very top of the site, around the healing springs. Here you can bathe in Cleopatra’s very own hot bath, said to have been a gift from Mark Antony; once covered by the Roman temple of Apollo, the doric columns now lie in the water, and the pool is flanked with flowers.","turkey_pamukkale");
				AllData T3 = new AllData("Turkey","The Fairy Chimneys of Cappadocia","High on the Anatolian plateau, the curious landscapes of Cappadocia resemble a fantasy world. Honey-coloured rocks have eroded into sculptural forms resembling minarets, magic mushrooms and what have become known as Fairy Chimneys, while underground, settlers since the Bronze Age have been busy carving out cave houses, churches and monasteries from the soft volcanic rock – even entire subterranean cities. The thing to do is take a hot-air balloon ride at sunrise or sunset; alternatively, see it on horseback or two wheels – or watch the spectacle from the terrace of your cave hotel in the town of Göreme (try Sultan Cave Suites for its rooftop, Museum Hotel or Kayakapi which all have outdoor pools; rustic-charming Cappadocia Cave Suites; or film-set-like Yunak Evleri) as hundreds of balloons drift overhead and the low sun casts apricot light on this extraordinary land. One of the most romantic spots on earth.","turkey_fairy");
				AllData T4 = new AllData("Turkey","Ephesus","Turkey has a great number of ancient sites, most far less visited than similar sites in Italy and Greece; and Ephesus, now UNESCO-protected, is arguably the grandest of them all. The Temple of Artemis which stood in the ancient city of Ephesus was one of the original Seven Wonders of the World. Little remains of it now, but the remains of Ephesus are wondrous nonetheless. Set back from the Aegean coast, the settlement began 9,000 years ago. There Roman, Christian, Ottoman, Hellenistic and Greek monuments: colonnaded streets, temples, a huge amphitheatre, the Celsus library whose carved façade still stands today, archways framing the blue Mediterranean sky.","turkey_efes");
				
				
				
				
				dataRepository.save(I1);
				dataRepository.save(I2);
				dataRepository.save(I3);
				dataRepository.save(I4);
				dataRepository.save(F1);
				dataRepository.save(F2);
				dataRepository.save(F3);
				dataRepository.save(F4);
				dataRepository.save(F5);
				dataRepository.save(T1);
				dataRepository.save(T2);
				dataRepository.save(T3);
				dataRepository.save(T4);
				
				
				
			}
			
			
			
		
	}
	
	
	@GetMapping("/data")
	public List<AllData> data(){
		
		return dataRepository.findAll();
	
	}
	
	
	
	


	
	
	
	
	
	
	
	

}
