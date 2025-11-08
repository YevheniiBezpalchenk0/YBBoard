import { useState } from "react";
import api from "../services/api";
import type { Project } from "../services/interfaces";

function CreateProject() {
    const [name, setName] = useState<string>("");
    const [projectType, setProjectType] = useState<"KANBAN" | "SCRUM">("KANBAN");

    async function CreateProject() {
        try {
            const response = await api.post<Project>('/api/project', {
                name,
                projectType
            });
            console.log("Project created successfully:", response.data);
        }
        catch (err) {
            console.log("Error on CreateProject.tsx; line 13: " + err);
        }
    }



    return (        
        <div className="Create_Project_Form">
            <h2>Create New Project</h2>
            <form>
                <label>Project Name:</label>
                <input
                    type="text"
                    value={name}
                    onChange={(e) => setName(e.target.value)}
                />
                <label>Project Type:</label>
                <div className="flex items-center space-x-4">
                    <label className="inline-flex items-center">
                    <input
                        type="radio"
                        name="projectType"
                        value="KANBAN"
                        checked={projectType === "KANBAN"}
                        onChange={() => setProjectType("KANBAN")}
                        className="form-radio"
                    />
                    <span className="ml-2 text-sm">KANBAN</span>
                    </label>

                    <label className="inline-flex items-center">
                    <input
                        type="radio"
                        name="projectType"
                        value="SCRUM"
                        checked={projectType === "SCRUM"}
                        onChange={() => setProjectType("SCRUM")}
                        className="form-radio"
                    />
                    <span className="ml-2 text-sm">SCRUM</span>
                    </label>
                </div>
                <button type="button" onClick={CreateProject}>Create Project</button>
            </form>
        </div>
    );
}
export default CreateProject;