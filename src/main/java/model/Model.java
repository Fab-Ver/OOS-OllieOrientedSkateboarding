package model;

import model.marker.MarkerManager;
import model.mission.MissionManager;

/**
 * 
 * The model of the application.
 *
 */
public interface Model {

    /**
     * Gets the {@link GameState}.
     * @return the {@link GameState}.
     */
    GameState getGameState();

    /**
     * Gets the {@link Statistics}.
     * @return the {@link Statistics}.
     */
    Statistics getStatistics();

    /**
     * Gets the {@link StatisticsUpdater}.
     * @return the {@link StatisticsUpdater}.
     */
    StatisticsUpdater getStatisticsUpdater();

    /**
     * Gets the {@link MarkerManager}.
     * @return the {@link MarkerManager}.
     */
    MarkerManager getMarkerManager();

    /**
     * Gets the {@link MissionManager}.
     * @return the {@link MissionManager}. 
     */
    MissionManager getMissionManager();

    /**
     * Updates the state of the game.
     * 
     */
    void update();

}
