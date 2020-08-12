/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.camunda.bpm.dmntesting;

import java.util.ArrayList;
import java.util.List;

import org.camunda.bpm.dmn.engine.delegate.DmnDecisionTableEvaluationEvent;
import org.camunda.bpm.dmn.engine.delegate.DmnDecisionTableEvaluationListener;
import org.springframework.stereotype.Component;

@Component
public class SimulatorDecisionTableEvaluationListener implements DmnDecisionTableEvaluationListener {

	protected DmnDecisionTableEvaluationEvent lastEvent;
	protected List<DmnDecisionTableEvaluationEvent> lastEvents = new ArrayList<DmnDecisionTableEvaluationEvent>();

	public void notify(DmnDecisionTableEvaluationEvent dmnDecisionTableEvaluationEvent) {
		lastEvent = dmnDecisionTableEvaluationEvent;
		lastEvents.add(dmnDecisionTableEvaluationEvent);
	}

	public DmnDecisionTableEvaluationEvent getLastEvent() {
		return lastEvent;
	}

	public List<DmnDecisionTableEvaluationEvent> getLastEvents() {
		return lastEvents;
	}

}