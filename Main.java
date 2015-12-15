/*
 * @brief SAMU - the potential ancestor of developmental robotics chatter bots
 *
 * @file main.hpp
 * @author  Norbert Bátfai <nbatfai@gmail.com>
 * @version 0.0.1
 *
 * @section LICENSE
 *
 * Copyright (C) 2015 Norbert Bátfai, batfai.norbert@inf.unideb.hu
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * @section DESCRIPTION
 * SAMU
 * 
 * The main purpose of this project is to allow the evaluation and 
 * verification of the results of the paper entitled "A disembodied 
 * developmental robotic agent called Samu Bátfai". It is our hope 
 * that Samu will be the ancestor of developmental robotics chatter 
 * bots that will be able to chat in natural language like humans do.
 *
 */


class Main {
	
	public static void main(String[] args) {

		// Do not remove this copyright notice!
		System.out.print( "This program will try to provide a disembodied DevRob agent called Samu Bátfai."
		  + "\n"
		  + "Copyright (C) 2015 Norbert Bátfai"
		  + "\n"
		  + "License GPLv3+: GNU GPL version 3 or later <http://gnu.org/licenses/gpl.html>"
		  + "\n"
		  + "This is free software: you are free to change and redistribute it."
		  + "\n"
		  + "There is NO WARRANTY, to the extent permitted by law."
		  + "\n"
		  + "\n");


		System.out.print("The prenatal development phase has started." + "\n");
	
		System.out.print("The prenatal development phase has finished." + "\n");


		String[] test = {
"The ant and the apple."
"The ant love an apple."
"That red apple has good quality."
"It is beautiful."
"It has perfect form."
"It has perfect shade."
"It has harmony touch."
"The red apple is so far from the ant."
"The ant still love it."
"The distance is unhandable."
"The ant have hope."
"The ant know how natural and healthy taste the apple have."
"The ant walked for days."
"The ant take the apple from the tree."
"The ant start slowly eat."
"The ant's tongue touch the apple."
"The ant is waiting for something special."
"It has to be necessary."
"The ant eat a small solid part."
"The apple is different."
"The apple is yellow."
"The apple is bitter."
"The apple is dead."
"The apple is so bad."
"The ant feel broken."
"The ant took a long road."
"It was unnecessary."
"The love passed."
"The ant don't love the apples now."
"Now the ant hate the apple."

		};

		int k = 0;

		for (Samu samu = new Samu(); samu.run();) {
			double sum = 0.0;
	    	for (int i = 0; i < 7; ++i) {
	    		samu.putIn(test[i]);
				sum += samu.reward();
	    	}
	    	System.out.print( "###### " + (++k) + "-th iter " + sum + "\n");
		}
	}
}
