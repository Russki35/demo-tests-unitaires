/**
 * 
 */
package dev.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author ETY8
 *
 */
public class CalculService {

	private static final Logger LOG = LoggerFactory.getLogger(CalculService.class);

	public int additionner(String expression) {
		
		int somme = 0;
		String[] tab = expression.split("\\+");
		
		for (String nb : tab){
			somme = somme + Integer.parseInt(nb); 
		}
		
		return somme;
	}
}
